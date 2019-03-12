### Singleton: can only return the same instance
1. only one priavte static final instance in the class
2. private constructor so no one can constructe a new obj from other class
3. static getter, return the static final instance
4. implements Cloneable, override clone() method

### Factory: return different implementation of an interface
1. components: an interface, several implementations classes, one factory class
2. getter with input: public xxx getInstance(String str), for different input will return different obj(implementation of the interface)

### prototype: return a deep clone of the previous obj when creating a new instance
1. components: a POJO class, a collection of POJO class implements cloneable
2. when creating the collection class, it will clone from the existing instance to speed up the process.

