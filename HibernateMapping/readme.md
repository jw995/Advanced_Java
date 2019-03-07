ORM: object relational mapping

Implementation: ORM tools to presist data -- Hibernate

connect java application with database -- jdbc -> use sql

Hibernate: can save obj into database directly with save(obj) method
	   create a session -> session.save()
	   create a sessionFactory -> needs configuration -> url, username, psw


@Entity (for POJO class)
@Table(name="") // specify alternative table name

How to config a hibernate project? -- install JBOSS in eclipse and then use the hibernate config new file to set up all you need 

Configuration -> SessionFactory -> Session -> begin transaction -> session.save(obj) -> commit transaction

@Embedded -> will embed the new fields into existing table wich has relation to the new Entity. Will not create a new table.

@OneToMany(mappedBy="")
@ManyToMany(mappedBy="")

FetchType.LAZY   will only fetch the data from Student table table when run session.get(Student.class), will not get its mapping to other table

FetchType.Eager  will also get the data from related tables using foreign keys. 
The default joining is LEFT OUTER JOIN







