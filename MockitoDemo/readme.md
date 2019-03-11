Junit: unit testing -- classes and methods

Annotations: 
@Before
@Test
@After

Mockito: 
Your class is dependent on other service or other applications
Have to mock that service(a movk or fake service -- which not the real service)
then can only test my own application without testing the 3rd party service

@Mock --- create a mock service that wont contain any content
@Rule public MockitoRule rule = MockitoJUnit.rule();   -- need to add this if using @Mock annotation

