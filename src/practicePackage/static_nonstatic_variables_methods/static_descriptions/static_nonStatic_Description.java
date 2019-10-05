/*
Static Variable
- doesn't need an object to be created for it to exist, it can already be accessed
- any objects created for the Class with the static variable will all point to the same static variable
- objects will not get their own copy of a static variable; they all refer to the same static variable
- static variables are declared when they should be used independently of any object
- does each object need to get its own copy of a variable?  This is the main consideration when deciding if a variable should be static

Static Method
- doesn't need an object to be created for it to exist
- static members are declared when they should be used independently of any object
- does each object need its own copy of a method? This is the main consideration when deciding if a method should be static
- static methods do not have access to non-Static instance variables
- static methods can only call other static methods
- static methods can only directly access static data
- static methods do not have a "this" reference - because this refers to "this" object

Static Blocks
- these are static blocks of code that execute when a Class is loaded - they execute before anything else
- Static blocks load before constructors
- Static blocks are applied at Class level whereas constructors are called at object level

General
- static variables and methods belong to their Class

Calling a static variable or method takes the following format:

Classname.variable or method name



/*
