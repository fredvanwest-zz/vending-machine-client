# vending-machine-client
Vending Machine Client - This service provides a REST interface for retrieving the contents of a vending machine.  In this
initial version, the resulting data is tied to the vending-machine-service by having its endpoint hard-coded.  With a small
amount of modification, the endpoint can be discoverable via Spring Cloud Eureka.  The project was built in support
of a blog entry for Unicon.
