# Interface segregation principle

# Clients should not be forced to depend upon interfaces that they do not use.

# Many dedicated interfaces are better than the general one. The principle of segregation
# interfaces is primarily designed to eliminate bulky, unnecessarily complex interfaces, 
# so that instances do not call unused methods.

class Car():
    
    def engine():
        pass

    def air_condition():
        pass

    def crank():
        pass
    
class Moskvitch(Car):
    pass

class Tesla(Car):
    pass

# Both classes describing car models will implement methods they don't use.
# According to the principle of segregation of intefaces, it is better to 
# divide them into smaller, more detailed ones.

class Cars():
    
    def engine():
        pass

class NewCars():

    def air_condition():
        pass

class OldCars():

    def crank():
        pass    

class Moskvitch(Cars, OldCars):
    def engine():
        pass
    def crank():
        pass


class Tesla(Cars, NewCars):

    def engine():
        pass
    def air_condition():
        pass