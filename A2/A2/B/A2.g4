grammar A2;

@header {
import java.util.TreeMap;
}

@members {

}

start
    :  {System.out.println("public class GeneratedFile {\n\tpublic static void main(String[] args){");}( stmt {System.out.println("\t\t" + $stmt.s+"\n");})+ EOF {System.out.println("\n\t}\n}");} EOF
    ;
    
stmt returns [String s]
    : declare_int { $s = $declare_int.s;}
    | assign_int { $s = $assign_int.s;}
    | while_init { $s = $while_init.s;}
    | while_close { $s = $while_close.s;}
    | greater { $s = $greater.s;}
    | less { $s = $less.s;}
    | add { $s = $add.s;}
    | assign_add {$s = $assign_add.s;}
    | minus {$s = $minus.s;}
    | assign_minus {$s = $assign_minus.s;}
    | divide {$s = $divide.s;}
    | minus_times_divide {$s = $minus_times_divide.s;}
    | assign_m_times_d {$s = $assign_m_times_d.s;}
    ;

declare_int returns [String s]
    : 'declare' ID ':''=' 'Integer'
        {
            $s = "int "+$ID.getText()+";";
        }
    ;

assign_int returns [String s]
    : name=ID ':''=' var
        {
            $s = $name.getText() + " = " + $var.number +";";
        }
    ;

while_init returns [String s]
    : 'while''('expr')''do'
        {
            $s = "while " +$expr.s + " {";
        }
    ;

while_close returns [String s]
    : 'end while'
        {
            $s = "}";
        }
    ;

expr returns [String s]
    : s1=stmt 'and' s2=stmt
        {
            $s = "( "+$s1.s +" && "+$s2.s+" )";
        }
    ;
    
greater returns [String s]
    : name=ID '>' var
        {
            $s = $name.getText() +" > "+$var.number;
        }
    ;

less returns [String s]
    : name=ID '<' var
        {
            $s = $name.getText() +" < " +$var.number;
        }
    ;

add returns [String s]
    : name=ID '+' var
        {
            $s = $name.getText() + " + " +$var.number;
        }
    ;
minus returns [String s]
    : name=ID '-' var
        {
            $s = $name.getText() + " - " +$var.number;
        }
    ;

assign_add returns [String s]
    : name=ID ':''=' add
        {
            $s = $name.getText() + " = " + $add.s+";";
        }
    ;
    
assign_minus returns [String s]
    : name=ID ':''=' minus
        {
            $s = $name.getText() + " = " + $minus.s+";";
        }
    ;
    
divide returns [String s]
    : var '/' name=ID
        {
            $s = $var.number + " / " + $name.getText();
        }
    ;
    
minus_times_divide returns [String s]
    : '(''('minus')''*''('divide')'')'
        {
            $s = "(( " + $minus.s + " ) * (" + $divide.s + " ));";
        }
    ;
    
assign_m_times_d returns [String s]
    : name=ID ':''=' minus_times_divide
        {
            $s = $name.getText() + " = " + $minus_times_divide.s;
        }
    ;

var returns [String number]
    : ID 
        {
            $number = $ID.getText();
        }
    | NUM
        {
            $number = ""+ $NUM.getText();
        }
    ;    
    
  

/* Terminal Symbols */
NUM : ('0' .. '9')+ ;
ID : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-')* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;        