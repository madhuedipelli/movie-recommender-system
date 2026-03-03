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
- Understanding the priority: explicit name resolution > @Primary > error
- Demonstrates bean selection strategy

---

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

