from tkinter import *

dimension = 72
width_in_squares = 18
height_in_squares = 10

class Box(object):
    def __init__(self):
        self.testBoxX = 0 
        self.testBoxY = 0

    def draw(self, canvas):
        canvas.create_rectangle(0, 0, dimension*(width_in_squares-1), dimension*(height_in_squares-1) , fill='white')
        canvas.create_rectangle(self.testBoxX, self.testBoxY, self.testBoxX+dimension, self.testBoxY+dimension, fill='lime green')

root = Tk()
canvas = Canvas(root, width=dimension*width_in_squares, height=dimension*height_in_squares)

box = Box()

def on_key_press(e):
    if e.keycode == 9:
        print(exit)
    elif e.keycode == 111:
        box.testBoxY -= dimension 
    elif e.keycode == 116:
        box.testBoxY += dimension
    elif e.keycode == 113:
        box.testBoxX -= dimension
    elif e.keycode == 114:
        box.testBoxX += dimension

    box.draw(canvas)

# Tell the canvas that we prepared a function that can deal with the key press events
canvas.bind("<KeyPress>", on_key_press)
canvas.pack()

# Select the canvas to be in focused so it actually recieves the key hittings
canvas.focus_set()

# Draw the box in the initial position
box.draw(canvas)

root.mainloop()
