# Polymorphism and Dynamic Binding Demo

![Polymorphism Demo](https://www.cs.wcupa.edu/schen/csc240/polymorphism.png)

If an object of a subclass has overridden a method in its superclass, and the its variable makes a call to that method, the subclasses’s version of the method will return.


Java performs **dynamic binding**, also known as late binding, when a variable contains a polymorphic reference.

The Java Virtual Machine determines at runtime which method to call, depending on the type of object that the variable references.

It is the **object’s type**, rather than the reference type, that **determines which method is called**.

Check **slides** ([Link](https://www.cs.wcupa.edu/schen/csc240/Polymorphism.pdf)) for more details. 