### 1.Monolithic v.s. Microservices
  Mono: Single unit
	-- every component is a class
   	-- unscalable, slow development, not efficient for large and complex 			applcations. 
	-- Unreliable, one service goes down, the whole system will break
	-- inflexible, takes a long time to add new technologies, have to rewrite
  Micro: Fine-grained
	-- a collection of self-contained services, each one implemetns a single 		business capability, all the micro services conmmunicate with each other 		and form a business domain. 
  SOA: Coarse-grained

### 2.Features Of Microservice Architecture -- simplicity
	small focused -- less effort to maintain each microservice
	loosely coupled -- the services are not affecting each other much
	language neutral -- it is easy to change language
	bounded context -- each microservice does not need to understand what are 		other services doing3

### 3.Advantages Of Microservice Architecture
	independent development
	independent deployment 
	fault isolation -- won't affect entire application if one service goes 		down
	mixed tech stack
	granular scaling

### 4. Implementation: Spring boot