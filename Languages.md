# General Notes
- $(\log_{10} 1234+1)$ gives us the number of digits in $1234$.

# C++
- Install: `pacman -S gcc clang`
## Notes
- \<iostream\> components:
    - std::cout :- Print data to the Terminal/Console
    - std::cin :- Read data from the Terminal (without spaces). Space is used as an escape character.
    - std::getline(std::cin,var) :- Read data with spaces, from the Terminal.
    - std::string :- String data type
    - std::cerr :- Print errors to the Terminal/Console
    - std::clog :- Print log messages to the Terminal/Console
        > Errors & Logs are printed regardless of the occurence of an error. They are just used to format the message according to it's type.

- Define variables:
    ```cpp
    int firstNumber {3};
    int secondNumber = 4;
    ```

## How a program runs
- Sample code:
```cpp
#include <iostream>

int addNumbers(int number1, int number2) {
    return (number1+number2);
}

int main() {
    int first_number {3};  // Variable 1
    int second_number {7}; // Variable 2
    int c;
    
    std::cout << "First number: " << first_number << std::endl;
    std::cout << "Second number: " << second_number << std::endl;
    c = addNumbers(a,b);
    std::cout << "Sum: " << sumFunc(first_number,second_number) << std::endl;

    return 0;
}
```
<br><img src="../assets/images/TIL-Coding/external/0.png">
Image taken from [here](https://youtu.be/8jLOx1hD3_o)
- Steps:
    1. The program is converted to binary, after compilation.
    1. When the binary is executed, it is copied to RAM line-by-line.
    1. For the function `addNumbers(a,b)` and input variables, it assigns a separate memory location on RAM.
    1. For Variable 1, it assigns a memory location with value `3` and points `first_number` to it.
    1. Same goes for `second_number`.
    1. Since `c` doesn't have a value, the CPU fills the location with garbage data.
    1. It prints the 2 strings.
    1. Next, it has to run the function `addNumbers(a,b)`. Before going to the function, it stores the current memory address of the code binary, so it can return to it once it's done executing the function.
    1. It goes ahead and runs the function.
    1. It takes the output of the function and returns back to same location it left.
    1. It prints the rest of the strings.
    1. Program execution is over.

## Terms:
- **Core Features**: The features that govern the functionality C++ provices, and the rules that we need to follow when using them.
    > data types, function definition, etc.
- **Standard Library**: A set of specialized reusable components that are ready to use, and provide added functionality to the program.
    > iostream, string (imported using `#include`)
- **STL**: A part of Standard Library. It is a collection of container types.
    > iterators

## Number Systems
### Binary
- Base 2
- If we have `n` digits, we can represent a total of $2^{n-1}$ decimel numbers.
- Examples:
    - $100101=1*2^5+1*0^4+0*2^3+1*2^2+0*2^1+1*2^0=37$
    - $10010=1*2^4+0*2^3+0*2^2+1*2^1+0*2^0=18$
- We add `Ob` in front to specify that it is a octal number. Example: $0b00110101$

### Decimel
- Base 10
- Examples:
    - $2371=2*10^3+3*10^2+7*10^1+1*10^0$
    - $924=9*10^2+2*10^1+4*10^0$
### Hexadecimel
- Base 16
- A Binary number is grouped to groups of 4 from the right, and then converted to hexadecimel.
- Example: $0x6E30F13F$
- 1-9 is represented as usual, and 10-15 is represented by A-F.
- Padding: When grouping numbers, if there are some missing digits in the left-most group, we add `0` to the missing places.
- We add `Ox` in front to specify that it is a hexadecimel number.

### Octal
- Base 8
- A Binary number is grouped to groups of 3 from the right, and then converted to octal.
- Example: $015614170477$
- We add `O` in front to specify that it is a octal number.

## Data Types
- sizeof(int): Prints the size in bytes
- Modifiers: 
    - Signed, Un-signed: Allows negative numbers, doesn't allow negative numbers.
    - short, long: reduce size by half, increase size by 2x
    - {123u}: Un-signed
    - {123ul}: Un-signed long
    - {123ll}: long long
- Int:
    - Integers
    - Size: $4$ bytes
    - Signed: allows negative, 0, and positive integers
    - Un-signed: allows only 0 & positive integers
- Fractional:
    - Float: 4 bytes, Double: 8 bytes, Long Double: 16 bytes
    - Initialization:
        - float var12 {1.12345f};
        - double var13 {1.12345};
        - long double var14 {1.12345678L};
    - Precision: The number of digits that will be printed, including the ones in LHS of decimel. Set: `std::cout << std::setprecision(20)`.
    - Infinity: 1.5 / 0 (positive), -1.5/0 (negative)
    - NaN: 0.0/0.0 or 0/0
- Boolean
    - bool: true (1) & false (0)
    - Size: $1$ byte
    - std::cout prints in notation: 1 & 0, by default. To print true & false, set `std::cout << std::boolalpha`.
- Character
    - Size: $1$ byte
    - Can be encoded in ASCII.
        - 0-9: 48-57, A-Z: 65-90, a-z: 97-122.
        - $a+2=c$
        ![ASCII](https://www.asciitable.com/asciifull.gif)
        - `static_cast<int>('a')` prints `97`: this tells the compiler to interpret the input as an integer.
- Auto
    - auto var1 {12.05f}
    - Tells compiler to automatically determine the data type
    - Once type is deduced during Initialization, the variable will only accept values of that type during further assignments.
        Example:
        ```cpp
        auto var1 {123u};
        auto var1 {56u}; // possible
        auto var1 {-22}; // not possible
        ```

## Operations on Data
- Precedence: Which operation to do first
- Associativity: The direction to execute operations in.
- Check [here](https://en.cppreference.com/w/cpp/language/operator_precedence) for the complete list.
- Basic: +,-,*,/,%
- Increment: ++ | Decrement: --
- Compound Assignment: +=, -=, *=, /=, %=
- Relational: <,<=,>,>=,==,!=
- Logical: &&,||,!
- Increment: Add 1 to the value.
- Decrement: Subtract 1 from the value.
    ```cpp
    int value = 29;
    std::cout << value++ << std::endl;    // Postfix: Print first, then Increment.
    std::cout << ++value << std::endl;    // Prefix: Increment first, then Print.
    std::cout << value-- << std::endl;    // Postfix: Print first, then Decrement.
    std::cout << --value << std::endl;    // Prefix: Decrement first, then Print.
    ```

## Output formatting
- Headers: iomanip, ios
- Check [here](https://en.cppreference.com/w/cpp/io/manip) for the complete list.
- Formatters:
    - `std::endl`, "\n": Prints a new line
    - `std::cout`: First puts the string in a buffer, then prints it all at once
    - `std::flush`: Prints the string directly, without involving a buffer.
    - `std::setw(10)`: Set width of the text of the field, in which the string is printed. Measured in characters.
    - `std::setfill('-')`: Used in conjunction with `set::setw()`. Sets the fill character to something other than ' '.
    - `std::right`: Set right alignment *for following outputs*.
    - `std::internal`: Set internal justified. In `-122.2`, `-` is left justified, while `122.2` is default justified.
    - `std::boolalpha`: Force boolean output as `true` or `false` *for following outputs*.
    - `std::noboolalpha`: Disable it.
    - `std::showpos`: Prefix positive numbers with `+`, Example `+23`, *for following outputs*.
    - `std::noshowpos`: Disable it.
    - `std::showpoint`: Show the point (even if output is `12` -> `12.0`, `13.1` -> `13.1000` etc), *for following outputs*.
    - `std::noshowpoint`: Show the point when needed (default), *for following outputs*.
    - `std::showbase`: Show the base notation for the number systems, *for following outputs*.
    - `std::uppercase`: show the base notation in uppercase, *for following outputs*.
    - `std::nouppercase`: Disable it.
    - `std::dec`: Show number as decimel.
    - `std::hex`: Show number as hexadecimel.
    - `std::oct`: Show number as octal.
    - `std::fixed`: Show fixed numbers (don't use E+10,E-10, etc), *for following outputs*.
    - `std::scientific`: Show scientific notation (default), *for following outputs*.
    - `std::setprecision(10)`: Show 10 digits after decimel, *for following outputs*.

# Go
- Install: `pacman -S go`
- Go was designed to run on multiple cores and built to support concurrency. It is cheap and easy.
- We use Go to write performant back-end server-side applications.
- Go compiles code into single binary (machine code), that can run cross-platform.
- Get started:
    - Create a new directory for the project, and cd to it.
    - Initialize the Go project with `go mod init package-name`.
    - Main file: `main.go`.
    - Inside the main file, define the entry-point, the point where the execution starts: `func main() {}`.
    - Run program with `go run main.go`.
- Functions:
    - Functions aren't executed unless called.
    - All user-defined functions must be written after `func main()`.
    - `func something() { //code }`
        - Call this function by: `something()`
    - `func something(parameter1 string, parameter2 int) { // code}`
        - Call this function by: `something(parameter1, parameter2)`
    - `func something(parameter1 string) int { return 10 }`
        - Call this function by: `const num = something(parameter1)`
        - function takes string as input, returns an integer.

    - Every program mandatorily has the main function: `func main() {}`
    - `func validateUser(parameter1 string, parameter2 string, parameter3 uint) (bool,uint,int) { return parameter1,parameter2,parameter3}`
        - Call this function by: `var1,var2,var3 := something(parameter1, parameter2, parameter3)` OR `var1 var2 var3 bool`, `var1,var2,var3 = something(parameter1, parameter2, parameter3)`
    - If we want to use a function imported from another package, we have to explicitely export the function.
        - Typical function: `func funcName() { }`
        - Exported function: `func FuncName() { }`
        - Capitalizing the first letter exports the function, and we can then use it from a different package.

- Miscellaneous info:
    - Put `_` in place of a variable you don't want to use.
    - Errors:
        - To prevent dead code, we need to use every variable / method we have defined, otherwise it'll throw a compile error.
        - Go detects errors at compile time what other programming languages would only detect at runtime.
- Packages:
    - Files are organized in Go, into packages.
    - Multiple files can belong to the same package.
    - Multiple packages can be defined to organize the code further. The standard practice is to create folders for each user-defined package.
        - But, in this case, we need to import this package in the main file, since Go does not know it's location.
        - file1.go: `package temppkg`
        - main.go: `import "project-name/temppkg"`
    - If we want to use a function imported from another package, we have to explicitely export the function.
        - Typical function: `func funcName() { }`
        - Exported function: `func FuncName() { }`
        - Capitalizing the first letter exports the function, and we can then use it from a different package.
        - The same is true for variables.
    - The default package is usually named `main`.
    - Put the file in a package: `package name`
    - Once we have multiple packages in our Go project, we need to tell go to execute all of them when running the main function.
        - `go run main.go file1.go file2.go`: Run these particular files.
        - `go run .`: Run all files in the project.
    - Common pre-defined packages:
        1. `fmt`:
            - All available [formats](https://pkg.go.dev/fmt).
            - `Print`: Print the output.
            - `Println`: Print the output, then move to a new line.
            - `Printf`: Print the output in a specific format.
            - `Scan`: Take a value as input.
        1. `strings`:
            - Fields(str): Splits the string into a slice, with whitespace as the separator.
            - Contains(str,char): Checks if string str contains character char.
        1. `strconv`
            - FormatUint(uint64(25),10): Format the Un-signed integer (10: Decimel type) to a string.
- When printing variables with a string, spaces will get added on both sides of the variable automatically.
- Variable: 
    ```go
    var temp = 20
    temp := 20
    var temp int = 20
    var temp int
    ```
- Constant: 
    ```go
    const temp = "20"
    const temp string
    ```
- Global variables cannot be defined like `temp := 20`
- Minimal definition: `temp := 20`
    - Define the variable, guess & define it's type.
    - The variable type cannot be changed, but value can.
    - Constants cannot be defined in this way.
- Variables have 3 scopes: `Local`, `Package` & `Global`.
    - Local: 
        - `var temp = 20`
        - `temp := 20`
    - Package: 
        - `var temp = 20`
    - Global: 
        - `var Temp = 20` (notice the Capitalized letter)
- Formatters:
    - %v: value
    - %T: data type
- Data types:
    - string: String
    - int: Integers
    - uint: Un-signed integer, only acccepts positive numbers and 0.
    - float: Floating point numbers
    - `userData["userTickets"] = strconv.FormatUint(uint64(userTickets),10)` // Type: UInt64, Base 10 ie Decimel number.

- Data Structures:
    - Arrays (lists with fixed size):
        ```go
        var test0 = [10]string{"AAA","BBB","CCC"}
        var test [50]int
        test[0] = 20
        test[1] = 30
        
        fmt.Printf(test)      | [20,30,0,0,0,0,0...]
        fmt.Printf(len(test)) | > 50
        ```
    - Slices (lists with dynamic size):
        ```go
        var test = []string
        test = append(test, "AAA")
        test = append(test, "BBB")
        fmt.Printf(test)      | [AAA BBB]
        fmt.Printf(len(test)) | > 2
        ```
    - Maps:
        ```go
        var maps = make(map[int]string)
        // Create a map with string:integer key:value pairs.
        // Length will dynamically increase as we add more data to it.
        // Inserting values
        userData[10] = somestring
        
        // Create a list which contains maps. Initial length is 0, and it will dynamically increase (property of [] list) as data gets added.
        var listWithMapInside = make([]map[string]int,0)
        ```
- Pointers: A pointer is a special variable that points to the memory address of another variable.
    ```go
    fmt.Scan(&user)    // Takes the value for `user` as input, stores in in the memory address.
    fmt.Println(&user) // Prints the memory address of `user`
    ```
- Loops:
    - `for` loop is used for checking the condition repeatedly, `if-else` is used for checking it once.
    - for:
        - Infinite: `for { // statements }` or `for (true) { // statements }`
    - for-each:
        - `for index,value := range list { //statements }`
        - `index`: The index (0,1,2,etc)
        - `value`: The value at each index
        - `list`: The list we intend to iterate through
    - finite for:
        - `for (condition) || (condition) { //statements }`
    - if-else:
        - `if(condition) { //statements } else { //statements }`
        - `if(condition) { //statements } else if(condition) { //statements}`
    - switch:
        ```go
        switch (num) {
            case 1:
                // single match
            case 2,3:
                // multiple match
            default:
                // code run when none of the conditions match.
        }
        ```
- Breaking a loop:
    - `break`: End all the loops.
    - `continue`: Ignore all remaining statements in the loop and continue with the next iteration.
