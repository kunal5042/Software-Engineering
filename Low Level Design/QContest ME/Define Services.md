#### Background

Entities are the backbone of the application. They do a considerable amount of work by relating to real-world objects around us. But they aren’t capable of solving the use cases posed by the users, on their own. A driving force is needed to collaborate with the entities, forming a collection of steps to solve each use case. A service is that driving force which helps to solve the use cases.

Data Repository, on the other hand, is the data enabler which stores and provides data required for the services to act.

#### Overview of QContest Functionalities

Below visual gives you a high level overview of the basic functionalities any contest application must have.
![image](https://storage.googleapis.com/crio-content-container-assets/ME_QCONTEST_MODULE_ME_QCONTEST_MODULE_SERVICES_1662052399_image_2.png)

#### Real World Analogy

Below visual analogy demonstrates the flow which happens in most of the software applications.

![image](https://storage.googleapis.com/crio-content-container-assets/ME_QCONTEST_MODULE_ME_QCONTEST_MODULE_SERVICES_1662052400_image_3.png)

Services:-

- Service Objects describe a single use case that the application should have. It will often correspond one-to-one with a feature request from a stakeholder. For example, it should be possible to add a product to the catalog, to cancel an order, to send a delivery note to a customer, etc.
    
- Service Objects are created once, and then be used any number of times, but nothing can be changed about them. They have a very simple lifecycle.
    
- Once they’ve been created, they can run forever, like little machines with specific tasks.
    

Repositories:-

- Repository Objects hold some data ( models / entities ), and optionally expose some behavior (methods) for manipulating or retrieving or saving that data.
    
- Repository Objects are used by the services to complete their task.
    
- Its interface hides the underlying technology data store that’s been used. Services doesn’t care if In Memory data-structure like HashMap or databases like SQL, Mongo, etc is being used as long as the Repository Implementation of these databases is able to provide consistent results.
    