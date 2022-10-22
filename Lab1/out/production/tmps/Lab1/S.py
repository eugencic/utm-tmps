# Single-responsibility principle 

# There should never be more than one reason for a class to change.
# In other words, every class should have only one responsibility.

class OnlineShop():
    
    def add_product():
        pass

    def update_product():
        pass

    def create_user():
        pass

    def user_session():
        pass

# This class has much more than one reason to modify ...
# Classes for handling single tasks should be separated from it.

class UserCreation():
    pass

class ProductUpdate():
    pass

class ProductAdd():
    pass
    
# However, a single task does not mean a single method

class UserSession():
    
    def login():
        pass

    def logout():
        pass