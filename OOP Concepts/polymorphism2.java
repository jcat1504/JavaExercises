//dynmamic method dispatch is the mechanism by which a call to an overriden method is resolved at run time, rather than compile time
//when an overriden method is called through a superclass reference, Java determines which version(superclass/subclasses) of
//that method is to be executed based upon the type of the object being referred to at the time the call occurs.
    //thus this determination is made at run time
//at run time, it depends onthe type of the object being referred to(not the type reference variable) that determines
//which version of an overriden method will be executed
//a superclass reference variable can refer to a subclass object. this is known as upcasting.

//upcasting: 
SuperClass obj = new SubClass 

//therefore if a superclass contains a method that is overriden by a subclass, then when different types of objects are referred 
//through a superclass reference variable, different versions of the method are executed.

