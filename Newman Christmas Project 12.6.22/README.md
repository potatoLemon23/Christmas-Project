## Pseudocode
1. Print out original, uncorrected array
   1. printArray
2. Format original array 
   1. For loop
   2. Convert all Strings to uppercase (toUpperCase)
   3. Change gifts to coal if the child is marked naughty (.equals)
3. Display new array
   1. Suspense (Thread.sleep)
   2. printArray
4. Prompt for new entries and automatically format the input
   1. do...while loop
   2. Ask for yes or no to adding children (yesno)
      1. If no, end program (break;)
      2. If yes:
         1. Convert all Strings to uppercase (toUpperCase)
         2. Change gifts to coal if the child is marked naughty (.equals)
5. Display the new data, then return to #4.
6. Change colors of lines
   1. Naughty = Red (.equals and Colors.Red)
   2. Nice = Green (.equals and Colors.Green)
   3. Unlisted = Yellow (.equals and Colors.Yellow)
