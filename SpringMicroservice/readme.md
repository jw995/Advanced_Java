### 1.Monolithic v.s. Microservices
  Mono: Single unit
	-- every component is a class
   	-- unscalable, slow development, not efficient for large and complex applcations. 
	-- Unreliable, one service goes down, the whole system will break
	-- inflexible, takes a long time to add new technologies, have to rewrite
  Micro: Fine-grained
	-- a collection of self-contained services, each one implemetns a single business capability, all the micro services conmmunicate 	  with each other and form a business domain. 
  SOA: Coarse-grained

### 2.Features Of Microservice Architecture -- simplicity
	small focused -- less effort to maintain each microservice
	loosely coupled -- the services are not affecting each other much
	language neutral -- it is easy to change language
	bounded context -- each microservice does not need to understand what are other services doing3

### 3.Advantages Of Microservice Architecture
	independent development
	independent deployment 
	fault isolation -- won't affect entire application if one service goes down
	mixed tech stack
	granular scaling
	spring boot -- auto config, Acuator can check if the service is healthy (url: /health)

### 4. Implementation: Spring boot

### 5. Disadvantage of Microservice
The system architechture will become complex, hard to debug or maintain since all the logs are at the same place. 

##### *all theb service are stateless, so there is no sessions, use token
### 6.steps to build and config a microservice
-- create several spring boot appplications
-- create relationship(REST calls) between the applcications(services) 
