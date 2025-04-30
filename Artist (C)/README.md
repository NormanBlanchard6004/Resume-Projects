# Artist Terminal Application
#### Video Demo Link: https://youtu.be/rxsq2GhahXs
#### Description:
The purpose of this program is to create a canvas that the user can use to draw pictures on.
The program is interactive and designed to offer flexibility and ease of use for anyone who wants to create simple drawings.
First, users are prompted to enter the width and height of the canvas.
The maximum dimension for either value is capped at 100 to ensure the program remains efficient and manageable.
Proper error checking has been implemented to validate the input.
For example, if a user enters a non-numeric value or a number greater than 100, the program will display an error message and prompt the user to try again.
This ensures that the canvas dimensions are always within acceptable limits, preventing any potential crashes or unexpected behavior.

Once the canvas is successfully created, users are presented with a menu featuring eight options: Draw Point, Draw Horizontal Line, Draw Vertical Line, Draw Rectangle, Erase, Display Picture, Resize Canvas, and Exit and Display Picture.
Each option is designed to provide a unique way to interact with the canvas.
For instance, if users select the "Draw Point" option, they will be prompted to enter both the x and y coordinates of the point they wish to plot.
Additionally, they will specify the character they want to use for that point.
For example, a user might input an x position of 5, a y position of 5, and the character !.
The program will then place the ! character at the specified coordinates on the canvas.

One of the key features of this program is that users are not immediately shown the updated canvas after executing a drawing command.
Instead, they can continue drawing multiple points, lines, or shapes without interruption.
This allows for a seamless workflow, especially for users who wish to make several edits before previewing their work.
To view their progress, users can select the "Display Picture" option from the menu.
This command will render the current state of the canvas and display the image they have been creating.

Another useful feature is the ability to resize the canvas.
If users decide they want to enlarge or shrink the size of the existing canvas, they can do so by selecting the "Resize Canvas" option.
The program will prompt them to input new dimensions, ensuring that neither the width nor the height exceeds the maximum limit of 100.
Resizing the canvas preserves the content already drawn, although some parts of the image may be cropped if the canvas is shrunk significantly.
This feature is particularly helpful for users who start with a smaller canvas and later decide they need more space for their drawings.

The program is designed to be user-friendly, allowing users to continue drawing, erasing, or resizing the canvas as much as they like.
When they are ready to exit, they can choose the "Exit and Display Picture" option.
This command not only terminates the program but also displays the final version of the canvas, giving users a chance to admire their work before closing the application.
If users wish to start a new drawing, they can simply restart the program and begin again with a fresh canvas.

Now that the program's functionality has been explained, I will discuss how I implemented it.
To maintain a clean and organized structure, I made extensive use of defined functions throughout the program.
These functions are located below the main function and serve to handle specific tasks, keeping the main function concise and easy to read.
In total, I implemented ten functions that correspond to the various menu options, ensuring each one works as intended.
For example, there are dedicated functions for drawing points, lines, and rectangles, as well as for erasing characters and resizing the canvas.

In addition to these menu-related functions, I created utility functions like readInteger and readCharacter.
These functions are responsible for handling user input and validating it to prevent errors.
For example, if a user accidentally enters invalid data, such as a letter when a number is expected, these functions will catch the mistake and prompt the user to enter the correct type of data.
This level of error handling ensures the program remains robust and user-friendly.

To implement the drawing functionality, I used a combination of loops and conditional statements.
For example, when a user chooses to draw a horizontal or vertical line, the program uses for loops to iterate through the canvas array and update the appropriate positions with the chosen character.
Similarly, when drawing rectangles, the program calculates the boundaries of the shape and fills in the corresponding rows and columns.
This approach allows for precise control over what gets drawn on the canvas.

Erasing characters from the canvas works in a similar way.
When the "Erase" option is selected, the program prompts the user for the coordinates of the point they want to clear.
Using a loop, the program locates the specified position in the canvas array and replaces the character at that position with a blank space.
This functionality is especially useful for making corrections or cleaning up the canvas without having to start over entirely.

In conclusion, this program combines simplicity and versatility to provide a powerful tool for creating and editing drawings.
By leveraging well-structured functions, robust error handling, and efficient looping mechanisms, it delivers an intuitive and reliable experience for users.
Whether they want to create intricate designs or experiment with basic shapes, this program offers the flexibility and functionality needed to bring their ideas to life.
