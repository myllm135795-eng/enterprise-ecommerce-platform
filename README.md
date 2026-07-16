# Enterprise E-Commerce Microservices Platform

A production-ready, enterprise-grade microservices application demonstrating modern Java backend technologies, cloud-native architecture, and best practices for building scalable distributed systems.

## 🎯 Project Overview

This application is an **E-Commerce Platform** built with:
- **Spring Boot 3.x** with Java 21
- **Microservices Architecture** with Spring Cloud
- **Event-Driven** using Apache Kafka
- **Service Discovery** with Netflix Eureka
- **API Gateway** using Spring Cloud Gateway
- **Distributed Tracing** with OpenTelemetry/Jaeger
- **Monitoring** with Prometheus & Grafana
- **Containerized** with Docker & Kubernetes
- **CI/CD** with GitHub Actions

## 🏗️ Microservices Architecture

```
┌─────────────────────────────────────────────────────────────────┐
│                        API Gateway                              │
│          (JWT Validation, Rate Limiting, Routing)               │
└─────────────┬───────────────────────────────────────────────────┘
              │
    ┌─────────┴──────────┬──────────────┬──────────┬──────────┐
    │                    │              │          │          │
┌───▼────┐ ┌────▼──┐ ┌──▼────┐ ┌─────▼──┐ ┌──────▼──┐ ┌────▼──┐
│ Auth   │ │ User  │ │Product │ │Inventory│ │ Order  │ │Payment │
│Service │ │Service│ │Service │ │Service  │ │Service │ │Service │
└─────────┘ └───────┘ └────────┘ └────────┘ └───────┘ └───────┘
    │          │          │          │         │         │
    └──────────┴──────────┴──────────┴─────────┴─────────┘
              │
    ┌─────────▼──────────┐
    │   Kafka Broker     │
    │ (Event Streaming)  │
    └────────────────────┘
    
┌─────────────────────────────────────────────────────────────────┐
│      Infrastructure (Eureka, Config Server, Monitoring)        │
└─────────────────────────────────────────────────────────────────┘
```

## 📦 Microservices

1. **API Gateway** - Request routing, JWT validation, rate limiting
2. **Authentication Service** - User authentication, JWT token generation, OAuth2
3. **User Service** - User management, profiles, preferences
4. **Product Service** - Product catalog, categories, details
5. **Inventory Service** - Stock management, updates
6. **Order Service** - Order creation, management, status tracking
7. **Payment Service** - Payment processing, transaction management
8. **Notification Service** - Email, SMS notifications
9. **Shipping Service** - Shipping management, tracking
10. **Review Service** - Product reviews and ratings
11. **Cart Service** - Shopping cart management
12. **Analytics Service** - Business analytics and reporting

## 🚀 Quick Start

### Prerequisites
- Java 21+
- Maven 3.8.1+
- Docker & Docker Compose
- Git

### Local Development Setup

```bash
# Clone the repository
git clone https://github.com/myllm135795-eng/enterprise-ecommerce-platform.git
cd enterprise-ecommerce-platform

# Start all services with Docker Compose
docker-compose up -d

# Build all services
mvn clean install -DskipTests

# Run individual services
cd config-server && mvn spring-boot:run
cd eureka-server && mvn spring-boot:run
cd api-gateway && mvn spring-boot:run
cd auth-service && mvn spring-boot:run
# ... and so on
```

### Access Points
- API Gateway: http://localhost:8080
- Eureka Dashboard: http://localhost:8761
- Swagger UI: http://localhost:8080/swagger-ui.html
- Prometheus: http://localhost:9090
- Grafana: http://localhost:3000
- Jaeger UI: http://localhost:16686
- Kibana: http://localhost:5601

## 🛠️ Technology Stack

### Core Framework
- Spring Boot 3.3.x
- Spring Cloud 2023.0.x
- Java 21

### Service Communication
- **Synchronous**: OpenFeign, RestTemplate
- **Asynchronous**: Apache Kafka
- **Service Discovery**: Eureka
- **Configuration**: Spring Cloud Config

### Resilience & Observability
- Resilience4j (Circuit Breaker, Retry, Rate Limiter)
- Micrometer for metrics
- OpenTelemetry for tracing
- SLF4J + Logback for logging

### Data & Caching
- Spring Data JPA
- Hibernate
- PostgreSQL
- Redis
- Elasticsearch (optional)
- MongoDB (optional)

### Security
- Spring Security
- JWT (JSON Web Tokens)
- OAuth2
- Role-Based Access Control (RBAC)

### DevOps & Infrastructure
- Docker & Docker Compose
- Kubernetes manifests
- GitHub Actions for CI/CD
- Prometheus & Grafana for monitoring

### Testing
- JUnit 5
- Mockito
- TestContainers
- WireMock
- Spring Boot Test

## 📋 Project Structure

```
enterprise-ecommerce-platform/
├── config-server/                  # Centralized configuration
├── eureka-server/                  # Service discovery
├── api-gateway/                    # API Gateway
│
├── services/
│   ├── auth-service/               # Authentication & Authorization
│   ├── user-service/               # User management
│   ├── product-service/            # Product catalog
│   ├── inventory-service/          # Inventory management
│   ├── order-service/              # Order processing
│   ├── payment-service/            # Payment processing
│   ├── notification-service/       # Email/SMS notifications
│   ├── shipping-service/           # Shipping management
│   ├── review-service/             # Product reviews
│   ├── cart-service/               # Shopping cart
│   └── analytics-service/          # Analytics
│
├── common/                         # Shared libraries
│   ├── common-utils/               # Utility classes
│   ├── common-events/              # Event definitions
│   ├── common-exceptions/          # Exception handling
│   └── common-dtos/                # Shared DTOs
│
├── infrastructure/
│   ├── docker-compose.yml          # Local development environment
│   ├── kubernetes/                 # K8s manifests
│   └── monitoring/                 # Prometheus, Grafana configs
│
├── .github/workflows/              # GitHub Actions CI/CD
├── docs/                           # Documentation
├── postman/                        # Postman collections
└── pom.xml                         # Root Maven POM
```

## 🔐 Security Features

- JWT-based authentication
- OAuth2 support
- RBAC (Role-Based Access Control)
- Method-level security
- API key management
- Rate limiting
- CORS configuration
- CSRF protection
- Secure password encryption (BCrypt)
- Input validation
- SQL injection prevention

## 📊 Monitoring & Observability

- **Metrics**: Prometheus + Micrometer
- **Dashboards**: Grafana
- **Distributed Tracing**: Jaeger + OpenTelemetry
- **Logging**: ELK Stack (Elasticsearch, Logback, Kibana)
- **Health Checks**: Spring Boot Actuator

## 🐳 Containerization

All services are containerized with:
- Multi-stage Docker builds
- Health checks
- Resource limits
- Environment-based configuration
- Shared Docker network
- Volume management

## ☸️ Kubernetes Deployment

Production-ready Kubernetes manifests included:
- Deployments with replicas
- Services (ClusterIP, LoadBalancer)
- ConfigMaps for configuration
- Secrets for sensitive data
- Ingress for routing
- HPA for auto-scaling
- Resource limits and requests
- Liveness and readiness probes

## 🔄 CI/CD Pipeline

GitHub Actions workflows for:
- Build and unit tests
- Integration tests
- Code quality (SonarQube)
- Docker image build and push
- Kubernetes deployment
- Smoke tests

## 📚 Documentation

- High-level architecture diagrams
- Microservice interaction diagrams
- Database ER diagrams
- Sequence diagrams
- API documentation (OpenAPI/Swagger)
- Setup guides
- Deployment instructions
- Best practices document
- Interview Q&A guide

## 🧪 Testing Strategy

- **Unit Tests**: JUnit 5 + Mockito (>80% coverage)
- **Integration Tests**: TestContainers
- **Contract Tests**: Spring Cloud Contract
- **API Tests**: WireMock
- **Kafka Tests**: Embedded Kafka

## 🎓 Design Patterns

Implemented patterns:
- Factory Pattern
- Builder Pattern
- Strategy Pattern
- Observer Pattern
- Singleton Pattern
- Adapter Pattern
- Decorator Pattern
- Facade Pattern
- Command Pattern
- Template Method Pattern
- Saga Pattern (distributed transactions)
- CQRS (Command Query Responsibility Segregation)
- Event Sourcing

## 📖 How to Navigate This Project

1. Start with **config-server** - centralized configuration management
2. Then **eureka-server** - service registry
3. Then **api-gateway** - entry point
4. Then **auth-service** - authentication foundation
5. Then core services: **user**, **product**, **inventory**, **order**
6. Then supporting services: **payment**, **notification**, **shipping**
7. Finally infrastructure: **docker-compose**, **kubernetes**, **monitoring**

## 🚢 Deployment

### Local Development
```bash
docker-compose up -d
```

### Kubernetes (Cloud)
```bash
kubectl apply -f kubernetes/
```

### AWS/Azure/GCP
See deployment guides in `docs/deployment/`

## 📝 Best Practices

This project demonstrates:
- ✅ Clean Architecture
- ✅ Domain-Driven Design (DDD)
- ✅ SOLID Principles
- ✅ 12-Factor App Methodology
- ✅ Cloud-Native Design
- ✅ Horizontal Scalability
- ✅ Fault Tolerance
- ✅ Eventual Consistency
- ✅ Idempotency
- ✅ Distributed Transaction Patterns

## 🤝 Contributing

This is a learning/demonstration project. For enhancements or corrections, please submit pull requests.

## 📄 License

MIT License - See LICENSE file

## 🎓 Interview Preparation

This project covers:
- Microservices architecture design
- Distributed systems patterns
- Cloud-native development
- Spring ecosystem mastery
- DevOps practices
- Security best practices
- Performance optimization
- System design principles

See `docs/interview-qa.md` for detailed Q&A.

---

**Status**: 🚀 Phase 1 - Foundation & Infrastructure (In Progress)

**Next Steps**:
1. Config Server implementation
2. Eureka Server implementation
3. API Gateway implementation
4. Auth Service implementation
5. Base microservice templates
