# Server Management System
The purpose of this application was to expose a REST API for managing servers for customers.  The following methods are available for use:

### Retrieve Server

**GET** `/servers?id={}`


### Create Server

**POST** `/servers?name={}&region={}&customer={}`


### Update Server

**PUT** `/servers?id={}&name={}&region={}&customer={}`

**ID is required, while Name, Region, and Customer are optional fields*


### Delete Server

**DELETE** `/servers?id={}`


By default, running the application creates a server instance on http://localhost:8080.  Methods can be reached via http://localhost:8080/servers*.
