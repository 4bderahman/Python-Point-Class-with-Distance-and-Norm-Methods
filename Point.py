class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def set_x(self, value):
        self.x = value

    def get_y(self):
        return self.y

    def set_y(self, value):
        self.y = value

    def distance(self, point):
        return ((self.x - point.x)**2 + (self.y - point.y)**2)**0.5

    def norm(self):
        return (self.x**2 + self.y**2)**0.5


class TestPoint:
    def test(self):
        point1 = Point()
        point2 = Point(3, 4)

        print(f"les cordonné par defaut: ({point1.get_x()}, {point1.get_y()})")
        print(f"Les cordonnée du point 2: ({point2.get_x()}, {point2.get_y()})")
        print(f"La distance entre point et Point2: {point1.distance(point2)}")
        print(f"la norme du Point2: {point2.norm()}")

test_point = TestPoint()
test_point.test()
