class Game_object(object):
    def __init__(self, position_x, position_y, costume_image):
        self.position_x = position_x
        self.position_y = position_y
        self.costume_image = "img/" + str(costume_image) + ".png"

    def draw(self, canvas):
        self.photo = PhotoImage(file=self.costume_image)
        canvas.create_image(self.position_x, self.position_y, anchor = NW, image = self.photo)

