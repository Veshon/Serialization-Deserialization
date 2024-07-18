Serialization & Deserialization

Serialization

Serialization in java means converting java objects into an object stream(eg:- ByteStream) and saving it in a file or in a Database.

The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform. To make a Java object serializable we implement the java.io.Serializable interface. The ObjectOutputStream class contains writeObject() method for serializing an Object. 


Serializable Interface,
Only the objects of those classes can be serialized which are implementing java.io.Serializable interface. Serializable is a marker interface (has no data member and method). It is used to “mark” java classes so that objects of these classes may get certain capability.

Advantages of Serialization 

To save/persist state of an object. (In a file or DB)
To travel an object across a network.


Deserialization

Deserialization in java means converting an object stream into a java object.

The ObjectInputStream class contains readObject() method for deserializing an object. 
