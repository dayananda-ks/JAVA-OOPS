#  Stack and Heap Memory in Java

##  Stack Memory

Stack is a memory area in JVM used to store method calls, local variables, and references.

### Key Features:
- Stores local variables (int, double, etc.)
- Stores object references (not actual objects)
- Works in LIFO (Last In First Out) order
- Each method call creates a stack frame
- Automatically cleared when method execution ends
- Very fast memory access

### Example:
```java
int a = 10;   // stored in stack
Calculator obj; // reference stored in stack
```         
## Heap Memory
Heap is a memory area in JVM used to store objects and their instance variables.
### Key Features:
- Stores actual objects and their instance variables
- Shared among all threads
- Objects created using `new` keyword are stored in heap
- Garbage collected when no longer referenced
- Slower than stack memory
### Example:
```java
Calculator obj = new Calculator(); // object stored in heap
```
