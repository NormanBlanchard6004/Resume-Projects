#include <stdio.h>

#define CANVAS_DIM 100 // Max dimensions of the canvas

// Function prototypes
typedef struct {
    int width;
    int height;
} CanvasDimensions;

typedef struct {
    int x;
    int y;
} Position;

void clearCanvas(char canvas[CANVAS_DIM][CANVAS_DIM], int height, int width);
int readInteger(int min, int max);
char readCharacter();
void readCanvasDimensions(CanvasDimensions* dimensions);
void readPosition(Position* pos, int width, int height);
void displayCanvas(char canvas[CANVAS_DIM][CANVAS_DIM], int height, int width);
void drawPoint(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, char draw_char);
void drawHorizontalLine(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, int length, char draw_char);
void drawVerticalLine(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, int length, char draw_char);
void drawRectangle(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, int length, int height, char draw_char);

int main() {
    char canvas[CANVAS_DIM][CANVAS_DIM];
    clearCanvas(canvas, CANVAS_DIM, CANVAS_DIM);

    CanvasDimensions dimensions;
    readCanvasDimensions(&dimensions);

    printf("################## Welcome to CS Paint! ##################\n");
    printf("p = Draw Point\n");
    printf("h = Draw Horizontal Line\n");
    printf("v = Draw Vertical Line\n");
    printf("r = Draw Rectangle\n");
    printf("e = Erase\n");
    printf("d = Display Picture\n");
    printf("s = Resize Canvas\n");
    printf("x = Exit and Display Picture\n");
    printf("##########################################################\n");

    char option;
    Position pos;
    int length, width;

    do {
        printf("Enter next command: ");
        scanf(" %c", &option);

        switch (option) {
            case 'p':
                readPosition(&pos, dimensions.width, dimensions.height);
                drawPoint(canvas, pos.x, pos.y, readCharacter());
                break;

            case 'h':
                readPosition(&pos, dimensions.width, dimensions.height);
                printf("Please enter length of line: ");
                length = readInteger(0, dimensions.width);
                drawHorizontalLine(canvas, pos.x, pos.y, length, readCharacter());
                break;

            case 'v':
                readPosition(&pos, dimensions.width, dimensions.height);
                printf("Please enter length of line: ");
                length = readInteger(0, dimensions.height);
                drawVerticalLine(canvas, pos.x, pos.y, length, readCharacter());
                break;

            case 'r':
                readPosition(&pos, dimensions.width, dimensions.height);
                printf("Please enter length of the rectangle: ");
                length = readInteger(0, dimensions.width);
                printf("Please enter width of the rectangle: ");
                width = readInteger(0, dimensions.height);
                drawRectangle(canvas, pos.x, pos.y, length, width, readCharacter());
                break;

            case 'e':
                clearCanvas(canvas, dimensions.height, dimensions.width);
                break;

            case 'd':
                displayCanvas(canvas, dimensions.height, dimensions.width);
                break;

            case 's':
                readCanvasDimensions(&dimensions);
                break;

            case 'x':
                printf("Exiting and displaying the canvas.\n");
                break;

            default:
                printf("Option '%c' is not supported.\n", option);
                break;
        }

    } while (option != 'x');

    displayCanvas(canvas, dimensions.height, dimensions.width);
    return 0;
}

int readInteger(int min, int max) {
    int value;
    do {
        printf("Enter a value between %d and %d: ", min, max);
        scanf("%d", &value);
    } while (value < min || value > max);
    return value;
}

char readCharacter() {
    char c;
    printf("Please enter the character to draw: ");
    scanf(" %c", &c);
    return c;
}

void readCanvasDimensions(CanvasDimensions* dimensions) {
    printf("Enter the canvas width: ");
    dimensions->width = readInteger(0, CANVAS_DIM);
    printf("Enter the canvas height: ");
    dimensions->height = readInteger(0, CANVAS_DIM);
}

void readPosition(Position* pos, int width, int height) {
    printf("Enter x position: ");
    pos->x = readInteger(0, width);
    printf("Enter y position: ");
    pos->y = readInteger(0, height);
}

void clearCanvas(char canvas[CANVAS_DIM][CANVAS_DIM], int height, int width) {
    for (int i = 0; i < height; ++i) {
        for (int j = 0; j < width; ++j) {
            canvas[i][j] = ' ';
        }
    }
}

void displayCanvas(char canvas[CANVAS_DIM][CANVAS_DIM], int height, int width) {
    for (int i = 0; i < height; ++i) {
        for (int j = 0; j < width; ++j) {
            putchar(canvas[i][j]);
        }
        putchar('\n');
    }
}

void drawPoint(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, char draw_char) {
    if (x >= 0 && x < CANVAS_DIM && y >= 0 && y < CANVAS_DIM) {
        canvas[y][x] = draw_char;
    }
}

void drawHorizontalLine(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, int length, char draw_char) {
    for (int i = 0; i < length && (x + i) < CANVAS_DIM; ++i) {
        drawPoint(canvas, x + i, y, draw_char);
    }
}

void drawVerticalLine(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, int length, char draw_char) {
    for (int i = 0; i < length && (y + i) < CANVAS_DIM; ++i) {
        drawPoint(canvas, x, y + i, draw_char);
    }
}

void drawRectangle(char canvas[CANVAS_DIM][CANVAS_DIM], int x, int y, int length, int height, char draw_char) {
    drawHorizontalLine(canvas, x, y, length, draw_char); // Top edge
    drawHorizontalLine(canvas, x, y + height - 1, length, draw_char); // Bottom edge
    drawVerticalLine(canvas, x, y, height, draw_char); // Left edge
    drawVerticalLine(canvas, x + length - 1, y, height, draw_char); // Right edge
}
