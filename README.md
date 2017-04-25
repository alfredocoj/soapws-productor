# soapws-productor
Producer SOAP web service using Spring Framework.

# Test the application

Now that the application is running, you can test it. Create a file request.xml containing the following SOAP request:

	<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
					  xmlns:gs="http://ws.br/soap">
	   <soapenv:Header/>
		<soapenv:Body>
			<gs:getAlunoRequest>
			<gs:alunoId>1</gs:alunoId>
		</gs:getAlunoRequest>
	   </soapenv:Body>
	 </soapenv:Envelope>

The are a few options when it comes to testing the SOAP interface. You can use something like SoapUI or just use command line tools if you are on a *nix/Mac system as shown below:

	$ curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws
	
	$ curl --header "content-type: text/xml" -d @requestPost.xml http://localhost:8080/ws

You can also consume this Web Service through the following SOAP Web Service consumer project:
	https://github.com/alfredocoj/wssoap-consumer
