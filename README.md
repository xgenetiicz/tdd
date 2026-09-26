# Learning Data Structures Through TDD

There's a big difference between understanding the theory and actually having it in your
fingers. I can always sketch out nested loops on a whiteboard, but this
is about taking it to the next level: getting core structures like `HashMap`,`ArrayList` and other `Data Structures` so deep into muscle memory and brain that they get written on pure automatic.
I'm convinced that writing these tests in JUnit 5 with a clearly expected result is exactly the key to becoming a genuinely good programmer.

This perspective really hit me after BuildHubs and I reflected a lot on how I should approach the best learning method for this. 
When JUnit 5 and Mockito finally "clicked" for
me. I stopped seeing testing as a chore to prove the code works. Instead, TDD became scaffolding
for my own learning - a method to build deep understanding step by step, instead of just
rushing ahead the second the code happens to compile and do what it's supposed to.

For me, this is by far the most effective way to bridge the gap from merely knowing a syntax
to real mastery. It's when you gradually force these combinations - test by test - that you go
from "knowing how a HashMap works" to thinking in complete architectures before you've even
touched the keyboard. I think this is really wise - because a lot of production code can go bad if a developer doesn't understand 
it well enough - and for actual preventing this, there should always be a rule to test it also as an integration test with randomPort for example
for the specific scenario. 

--- 
### Data structures testing
  
- [Tests](src/test/java/com/example/testDrivenDevelopment) -> you will find the tests here 
- [Service](src/main/java/com/example/testDrivenDevelopment/Service) -> the business-logic(service methods) for each data structure.

#### Enjoy!
