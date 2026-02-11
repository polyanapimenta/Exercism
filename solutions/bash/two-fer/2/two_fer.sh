#!/usr/bin/env bash

<<- 'COMMENT'
The '$#' is used to test the number of arguments.

In Bash, the special variable '$#' stores the number 
of arguments passed to the script or function. 

For example, if a Bash script is executed with 
three arguments (./script.sh arg1 arg2 arg3), 
the variable '$#' will contain the value 3.

echo "The name of the script is: $0"
echo "The first argument is: $1"
echo "The second argument is: $2"
echo "The third argument is: $3"
echo "All arguments are: $@"
echo "The number of arguments is: $#"

The name of the script is: ./script.sh
The first argument is: arg1
The second argument is: arg2
The third argument is: arg3
All arguments are: arg1 arg2 arg3
The number of arguments is: 3

In Bash, functions don't have a parameter signature 
like in other programming languages. 
Instead, you access the arguments directly through 
positional variables, which simplifies the function 
definition.
COMMENT

main () {
    if (($# == 0)); then
        name="you"
    else
        name="$1"
    fi

    echo "One for ${name}, one for me."
}

main "$@"