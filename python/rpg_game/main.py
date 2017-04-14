from tkinter import *
import game_object

dimension = 72
width_in_squares = 10 
height_in_squares = 8

class Draw(object):
    def __init__(self, game_objects):
        self.game_objects = game_objects

    def draw(self, game_object):
        self.temp_image = PhotoImage(file=game_object.costume_image)
        print(game_object.position_x)
        print(game_object.position_y)
        print(game_object.costume_image) 
        print(temp_image)
        canvas.create_image(game_object.position_x, game_object.position_y, anchor = NW, image = self.temp_image)


root = Tk()
root.wm_title("RPG Game")
canvas = Canvas(root, width=dimension*width_in_squares, height=dimension*height_in_squares)

game_object = game_object.Game_object(0, 0, "hero-down")

def on_key_press(e):
    if e.keycode == 9:
        sys.exit() 
    elif e.keycode == 111:
        game_object.position_y -= dimension
    elif e.keycode == 116:
        game_object.position_y += dimension
    elif e.keycode == 113:
        game_object.position_x -= dimension
    elif e.keycode == 114:
        game_object.position_x += dimension

    draw(self, game_object)

canvas.bind("<KeyPress>", on_key_press)
canvas.pack()
canvas.focus_set()

#photo = PhotoImage(file=game_object.costume_image)
#canvas.create_image(game_object.position_x, game_object.position_y , anchor = NW, image = photo)
draw(game_object)
root.mainloop()
