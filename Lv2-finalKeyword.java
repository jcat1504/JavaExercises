// - Classes marked as final cannot be extended. String class is always final
// - If we follow the rules of good design strictly, we should create and document a class carefully or declare it *final* for safety reasons. However, we should use caution when creating *final* classes.
// - Notice that making a class *final* means that no other programmer can improve it. Imagine that we're using a class and don’t have the source code for it, and there's a problem with one method.

// - **final fields can be either constants or write-once fields**
   //  - To distinguish them, we should ask a question — would we include this field if we were to serialize the object? If no, then it’s not part of the object, but a constant.
    
    // Note that according to naming conventions, class constants should be uppercase, with components separated by underscore (“_”) characters:
    static final int MAX_WIDTH = 999;