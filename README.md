Challenge One (put your answer in your README)

Which is a better hash function:
x % n where n is a large number with several factors
x % n where n is a large prime number
Prove your answer with a simple example.

N is a large prime number. This will help minimize collisions and will have a more equal distribution in your hashtable. An example of this could be n as 92. When you pass it through a hashmap in a large array it will place everything equally and uniformally based on the n value 92. 

Challenge Two (put your answer in your README)

Is char values summed % 599 a good hash function for strings? Why or why not?

It works as a basic function but it has some inhereneit issues. For example, it could result in collisions withing an array and will not have as well distributed distribution as it could. For example, "abc" and "cba" will hash to the same value. A more sophisticated algorithm like the DJB2 hash function will ensure a more distributed and less collided array than % 599.

Challenge Three (put your answer in your README)

Take a look at Java's HashMap class and how it produces hashed values, then describe how it works. (You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)

Java's HashMap class uses the hashCode() method of the key object to generate hash values. The HashMap class uses the hash code to calculate an index in the underlying array where the value associated with the key is stored. An example of this hash code is this: s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]. This is the hashCode() for strings and how key values are assigned to strings.
