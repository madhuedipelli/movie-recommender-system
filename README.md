# Movie Recommender System

A Spring Boot learning project progressing through fundamental concepts of dependency injection, bean management, and loose coupling.

## Learning Path: Spring Boot Fundamentals

### Core Concepts

**Program to Interfaces**
- Build applications based on interfaces, not concrete implementations
- Enables flexibility and loose coupling

**Beans**
- Objects managed by the Spring container
- Created and wired by Spring based on your configuration

**Dependencies**
- Objects that another object needs to function
- Spring automatically injects these dependencies

**Location of Beans**
- Spring searches for components in the classpath specified by `@ComponentScan`

**Spring Factory Concept**
> "I can only wire together objects that I created."

### @SpringBootApplication

Auto-enables all of the following:
- `@Configuration` - Declares a class as the source for bean definitions
- `@EnableAutoConfiguration` - Allows the application to add beans using classpath definitions
- `@ComponentScan` - Directs Spring to search for components in the path specified

---

## Lessons

### Lesson 1: Simple Dependency - Tight Coupling Demo
- Demonstrates tight coupling between classes
- Shows why direct instantiation leads to maintenance issues
- Foundation for understanding why loose coupling is important

### Lesson 2: Loose Coupling Using Interface Demo
- Introduces interfaces to decouple implementations
- Demonstrates how interfaces enable flexibility
- Shows how to switch implementations without changing client code

### Lesson 3: Beans, @Component, and @Autowired
- Using `@Component` to mark classes as Spring-managed beans
- Using `@Autowired` for dependency injection
- Initialization happens automatically without manual instantiation
- Brief introduction to `application.properties` and `applicationContext`
- **Key Insight:** No manual initialization of filter and passing needed!

### Lesson 4: Using @Primary
- Handling multiple implementations of the same interface
- Using `@Primary` annotation to specify the default bean to inject
- Spring automatically selects the primary bean when ambiguity exists

### Lesson 5: @Primary and Name Resolution
- Combining `@Primary` with name-based resolution
- Understanding the priority: **@Primary > name resolution > error**
- When multiple beans exist, `@Primary` takes precedence over name-based resolution
- Demonstrates bean selection strategy

### Lesson 6:
- `@Qualifier` annotation for fine-grained control over bean selection
- Resolving ambiguity when multiple beans of the same type exist
- Using `@Qualifier` to specify which bean to inject when `@Primary` is not sufficient
- @Qualifier takes precedence over @Primary

### Lesson 7:
- Constructor injection and setter injection
- by default, qualifier name is class name with first letter in lowercase, but can be overridden with @Component("customName") or @Qualifer("customName")


### Lesson 8:
- Prototype scope and singleton scope
- By default, Spring beans are singleton scoped, meaning only one instance is created and shared across the application.
- Prototype scope creates a new instance each time it is requested.
- other scopes include request, session, and application scopes for web applications.
- Singleton beans are created at application startup and remain in memory until the application is shut down, 
  - while prototype beans are created on demand and can be garbage collected when no longer needed.


## Project Structure

```
src/
├── main/
│   ├── java/io/datajek/spring/basics/movie_recommender_system/
│   │   ├── lesson1/     (Tight coupling demo)
│   │   ├── lesson2/     (Interface-based loose coupling)
│   │   ├── lesson3/     (Beans and dependency injection)
│   │   ├── lesson4/     (@Primary annotation)
│   │   └── lesson5/     (@Primary and name resolution)
│   └── resources/
│       └── application.properties
└── test/
    └── java/...
```

## Building and Running

```bash
./mvnw clean install
./mvnw spring-boot:run
```

## Technologies

- Java
- Spring Boot
- Maven

