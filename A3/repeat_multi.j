.class public MyApp
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10
ldc 0
istore 0
ldc 10
istore 1
label_3:
ldc 0
iload 1
isub
ifge label_1
ldc 1
goto label_2
label_1:
ldc 0
label_2:
ifeq label_4
iload 0
ldc 1
iadd
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
ldc 10
iadd
invokevirtual java/io/PrintStream/println(I)V
iload 1
ldc 1
isub
istore 1
goto label_3
label_4:
return
.end method
