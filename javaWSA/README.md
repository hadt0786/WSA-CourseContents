# JEE 6

## Date - 3 Dec

## history

J2EE, JEE1.4, JEE 1.5

### Topic - Tier layer

1.  1 - tier
    Presentation to Business Tier present in one machine
    Interacting CLient with business logic(account Transaction) interact with Database( validating account Transaction)

```
|        |-- presentation
| client |-- Business
|        |-- database
```

    cons - Lower performance, bulky, not going to work for other devices (google chrome can login from any other system and devices )

2.  2- Tier

```
|        |-- presentation       |        |              |         |
| client |-- Business           | Server |------------- | Database|
|        |----------------------|        |              |         |
```

3. 3- tier

```
|        |-- presentation       | Application       |              |         |
| client |-- Business           | Server            |------------- | Database|
|        |----------------------| *Tomcat, glassfish|              |         |

```

4. N - Tier

Everuthng os on N tier application

### HTTP CLIENT SERVER

HTTP/HTTPS -- path from client to server
WEB-INF -- Web nformation
WEBXML --- which static page going to load.

### Uniform resource Locator

    path address

protocol://host:port/path/file
http://www.soccer.org:80/league/Spring2001.html

### WEB SITE vs WEB APPLICATION

www.emertxee.com // web site
www.onlinesbi.com // web application

1. A web site is a collection of static files, HTML pages, graphics, and
   various other files.
2. A web application is an element of a web site that provides dynamic
3. functionality on the server.
   A web application runs a program or programs on the server.

### CGI Common gateway Interface

```
                        Path - http
    |               | ---request ---|           |           |             |
    | client machine|               |Server     |----CGI----|DBMS         |
    |               |               |(Servlet)  |           |(JDBC)       |

```

Demerit -- CGI create a new process every time. new process get created and leads to degrade performance

In CGI when a server receives a request it creates a new process to
run the CGI program, so creating a process for each request requires
significant server resources and time, which limits the number of
requests that can be processed concurrently.

CGI programs have the following advantages:
– Programs can be written in a variety of languages, although they
are primarily written in Perl.
– A CGI program with bugs does not crash the web server.
– Because CGI programs execute in separate processes,
concurrency issues are isolated at the database.
– CGI support is very common.

Disadvantages of CGI
Programs

- CGI program also have the following distinct disadvantages:
- The response time of CGI programs is high because the creation of a
  new process is a heavyweight activity for the operating system (OS).
- CGI does not scale well.
- The languages for CGI are not always secure r or object-oriented.

- The CGI script has to generate an HTML response,so the CGI code is
  mingled with HTML. This is not good separation of presentation and
  business logic.

## To overcome these disadvantage SERVLETS USED

SER - Server Component
LET - Componets

Facelets, triplet -- are all componenets

```
|---------------|                               |                   |       |           |
|   |       |   |                               |                   |       |           |
|   |       |   |-----|web.xml          |       | Server            |-------| DBMS      |
|   |       |   |     | choose          |       | (Static - HTML)   |       |           |
|---------------|     | web container   |       | Service(doget..)  |       |           |
                      |   Tomacat       |       |                   |



```
## Servlet LifeCycle

1. init() -- initialisation, get the resource
2. service(req, res),
3. doget(), do post
4. destroy()