# block51exercise

Our old code from the previous exercise has been updated based on the contents of the exercise (and subsequent lecture):

* We now have a separate sub-package DIT953.polygons.polygon containing the data representation.

* We have no outgoing dependencies from this package to DrawPolygons which lays outside of it.

* However we have an incoming dependency from DrawPolygons directly on the subclasses Triangle, Rectangle and Square, via concrete constructor calls.

* DrawPolygons still has problems with trying to do too much – this class has not yet been updated according to SRP. -->

1. Introduce a class PolygonFactory, with methods for creating triangles, rectangles, and squares.
    * Which arguments do the methods need? Which return types should the methods have?
    * Our new factory should live in the sub-package DIT953.polygons.polygon. Why?
    * Draw a class diagram of our new design. What is the public interface of the sub-package?
    * Can you make the interface even more abstract, i.e. expose even less of the package’s concrete internal implementation, without losing functionality?
    * Which of the SOLID-principles to these changes relate to, and how?

1. The package shapes is intended to be a well-defined (though not well-implemented yet) implementation of (Swing-) polygons.
    * How could the design of the shapes package be improved?
    * How can we switch out the representation of polygons in our DrawPolygons-program, to shapes?
    * Which refactoring steps would be needed so that when we make the switch we don’t need to change the code in DrawPolygons, apart from its imports?
    * Which components need to be added when we make the switch in order for us not to need to change DIT953.shapes?

    There is a design pattern that can be used to complete the task in question 2. You may search online to help you answer the question (or to find the name for the design pattern that you have reinvented, after you have answered it).
