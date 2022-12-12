# Laboratory Work No.3
## Topic: Behavioral Design Patterns
### Course: Software Design Techniques & Mechanisms Laboratory Works
### Author: Eugeniu Popa

## Objectives:
* Get familiar with the behavioral design patterns
* Choose a specific domain
* Implement at least 3 BDPs for the specific domain

## Theory
Behavioral design patterns are concerned with the interaction and responsibility of objects.
In these design patterns, the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.
That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.

There are 12 types of behavioral design patterns:
* Chain of Responsibility Pattern
* Command Pattern
* Interpreter Pattern
* Iterator Pattern
* Mediator Pattern
* Memento Pattern
* Observer Pattern
* State Pattern
* Strategy Pattern
* Template Pattern
* Visitor Pattern
* Null Object

## Implementation
The structural design patterns used in this laboratory work are:

### Interpreter

Interpreter pattern is used to define a grammatical representation for a language and provides an interpreter to deal with this grammar.
In this project, I created a search bar, in order for the clients to check if a certain product or factory is available at the sweet store.

In order to implement it, I have created an interface *Expression* (interpreter.Expression), which has one method - public boolean interpret. We pass a string to it.
```
  public interface Expression {
    boolean interpret(String context);
  }
```
*Interpreter* class, gets the data from *Expression* interface and interprets it
with the help of method interpret. (Method interpret() takes the data, tokenizes it, loops through and then checks
if it contains the console.input required string and returns true is exists or false if it does not).
```
  public boolean interpret(String str) {
    StringTokenizer st = new StringTokenizer(str);
      while (st.hasMoreTokens()) {
        String test = st.nextToken();
          if(test.matches(String.valueOf(data))) {
            return true;
          }
      } return false;
    }
  }
```
In *Main.java* it is displayed with the help of:
```
  Expression define = buildInterpreterTree();
```
```
  define.interpret(searchProduct) \\ returns true or false
```

### Chain of responsibilities
Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.
Later, the object in the chain will decide itself which will be processing the request and whether the request is required to be sent to the next object in the chain or not.

In order to implement it in my sweet shop, I have created and abstract class *Handler* (chain_of_responsibilities.Handler) with a Handler successor.
```
  protected Handler successor;
    
  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }
```
Then, I have created a public class, called *Request* (and a public enum *RequestType* where I've stored the commands for every successor (GOOD_REVIEW, BAD_REVIEW)) which sets getters to amount of reviews and type.
```
  public Request(RequestType requestType, int amount) {
    this.requestType = requestType;
      this.amount = amount;
  }
```
Also, I created 2 classes which extend Handle and represent career positions (*Director.java* which deals with good reviews and *VP.java* which deals with bad review and pretentious clients, because has more experience).

Director:
```
  public void handleRequest(Request request) {
    if(request.getRequestType() == RequestType.GOOD_REVIEW) {
      System.out.println("Director received your good review");
    }
    else {
      successor.handleRequest(request);
    }
  }
```
VP:
```
  public void handleRequest(Request request) {
    if(request.getRequestType() == RequestType.BAD_REVIEW) {
      if(request.getAmount() < 3) {
        System.out.println("VP received your bad review!");
      }
    }
  }
```

## Results
Implementing this behavioral design patterns into my code empowered me to extend its functionality.

I have created two additional cases in my switch statement ('f' for search bar and 'o' review).

If the client input of a product or factory is true, it displays its availability:

![alt text](https://github.com/eugencic/utm-tmps-labs/blob/main/Lab3/src/BehavioralDesignPatterns/Screenshots/1.png)

On the other hand, if the product or factory do not exist, it displays its unavailability:

![alt text](https://github.com/eugencic/utm-tmps-labs/blob/main/Lab3/src/BehavioralDesignPatterns/Screenshots/2.png)

If the client rates the shop between 3 and 5, we get a response from the director:

![alt text](https://github.com/eugencic/utm-tmps-labs/blob/main/Lab3/src/BehavioralDesignPatterns/Screenshots/3.png)

If the client rates the shop between 1 and 2, we get a response from the VP:

![alt text](https://github.com/eugencic/utm-tmps-labs/blob/main/Lab3/src/BehavioralDesignPatterns/Screenshots/4.png)
