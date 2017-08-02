import java.io.*;
import java.util.*;

public class TestAcceptance {
	private static ArrayList<String[]> t_state = new ArrayList<String[]>();
	

	// return next state if exists else return empty string
	private static String nextState(String i_state, String c_state, char symbol)  {
		String n_state = "";
		String c_sym = symbol + "";
		for (int i = 0; i < t_state.size(); i++)  {
			if (t_state.get(i)[0].equals(c_state) && t_state.get(i)[2].equals(c_sym))  {
				n_state = t_state.get(i)[1];
			} else if (t_state.get(i)[0].equals(i_state)&& t_state.get(i)[2].equals(c_sym))  {
				n_state = t_state.get(i)[1];
			}
		}


		return n_state;
	}
	public static void main(String[] args) throws Exception{
		if (args.length < 1) {
			System.out.println("Missing DFA file and/or String File.");
			System.exit(0);
		}

		String DFAfile = args[0];
		String StringFile = args[1];
		String result = "YES";
		String i_state;
		String f_state_in;
		String[] f_state;
		String[] t_state_in;
		String test_string;

		BufferedReader reader = new BufferedReader(new FileReader(DFAfile));

		// Read the initial state
		i_state = reader.readLine();

		// Read the final state
		f_state_in = reader.readLine();

		// tokenize final state
		f_state = f_state_in.split(" ");

		// Count how many transition state
		int line = 0;
		while (reader.readLine() != null)  {
			line++;
		}
		
		// Reopen the file and read the transition state
		t_state_in = new String[line];
		reader = new BufferedReader(new FileReader(DFAfile));

		reader.readLine(); reader.readLine(); // skip first two lines
		
		String s; line = 0;
		while ((s = reader.readLine()) != null)  {
			t_state_in[line] = s;
			line++;
		}

		// tokenize tranistion state
		for (int i = 0 ; i < line; i++) {
			String[] parts = t_state_in[i].split(" ");
			t_state.add(parts);
		}

		// read the test string
		reader = new BufferedReader(new FileReader(StringFile));
		test_string = reader.readLine();

		reader.close();


		//  Check all transition
		String c_state = i_state;
		int count = 0;
		while (count < test_string.length()) {
			//System.out.println("Test Char: " + test_string.charAt(count));
			c_state = nextState(i_state, c_state, test_string.charAt(count));
			if (c_state.equals(""))  {
				result = "NO";
				break;
			}
			//System.out.println("Current state: " + c_state);
			count++;
		}

		/* 
			Check if the current state is one of the final state
			print out YES if it is and exit the system
			else change the result to NO and print it out
		*/
		for (int i = 0; i < f_state.length; i++)  {
			if (c_state.equals(f_state[i]))  {
				System.out.println(result);
				System.exit(0);
			}
		}

		result = "NO";
		System.out.println(result);
	}
} 
