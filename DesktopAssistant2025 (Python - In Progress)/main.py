import sys # create gui with transparency
import pyttsx3 # offline text-to-speech
import pyautogui # allow interaction with desktop
import pygame # for animations and movement

from PyQt6.QtWidgets import QApplication, QLabel, QMainWindow # for building window with buttons
from PyQt6.QtGui import QPixmap # for working with images and color
from PyQt6.QtCore import Qt # for handling events and transparency

# start of main program
class FloatingAssistant(QMainWindow):
    def __init__(self):
        super().__init__()

        # remove title bar and set to always on top
        self.setWindowFlags(Qt.WindowType.FramelessWindowHint | Qt.WindowType.WindowStaysOnTopHint)

        # set transparent background
        self.setAttribute(Qt.WidgetAttribute.WA_TranslucentBackground)

        # load image of assistant
        self.label = QLabel(self)
        pixmap = QPixmap("assistant.png") # image needs transparency
        self.label.setPixmap(pixmap)
        self.label.setScaledContents(True)
        self.label.resize(pixmap.width(), pixmap.height())

        # set window size based on image
        self.setFixedSize(pixmap.width(), pixmap.height())

        # move to initial position
        self.move(100, 100)

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = FloatingAssistant()
    window.show()
    sys.exit(app.exec())