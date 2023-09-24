# poc-quarkus-soap-cxf

This project uses Quarkus with CXF for client and Reactive RestEasy.

The reactive version of CXF doesn't exist, but here I modified a SOAP service to be reactive.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Usage

Call a GET for http://localhost:8080/multiply?a=3&b=5 to multiply using CXF calling a SOAP for http://www.dneonline.com/calculator.asmx - classic mode

Call a GET for http://localhost:8080/sum?a=3&b=5 to sum using CXF calling a SOAP for http://www.dneonline.com/calculator.asmx - reactive mode
