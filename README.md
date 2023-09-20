# Welcome to the JAVA stack with Heidi

## Schedule (Links are not available until that lecture is complete)
<table>
<thead>
    <th></th>
    <th></th>
    <th> Category </th>
    <th> Topic </th>
    <th> Remarks</th>
</thead>
    <tbody>
    <tr>
        <td>W1D1 </td>
        <td>1</td>
        <td>Java Fundamentals</td>
        <td><a href="./Java1Fundamentals/"> Fundamentals </a></td>
        <td></td>
    </tr>
    <tr>
        <td>W1D2 </td>
        <td>2</td>
        <td>Java OOP</td>
        <td><a href="./Java2OOP/Part1"> OOP, access modifier, constructors </a> </td>
        <td> </td>
    </tr>
    <tr>
        <td>W1D3 </td>
        <td></td>
        <td> - Advanced OOP</td>
        <td><a href="./Java2OOP/Part2/">Inheritance, interface, Abstract </a></td>
        <td> require <a href="https://login.codingdojo.com/m/315/9381/65677">STS</a></td>
    </tr>
    <tr>
        <td>W1D4 </td>
        <td></td>
        <td>- Revision & Catch up</td>
        <td>Java Olympics & Hackathon</td>
        <td> <a href="https://github.com/heidi1105/JAVA_hackathon">Hackathon github </a></td>
    </tr>
    <tr>
        <td>W1D5 </td>
        <td>3</td>
        <td>Spring</td>
        <td>RestController, Routes, jsp, jstl</td>
        <td> require <a href="https://login.codingdojo.com/m/315/9532/64266">Maven</a>, <a href="https://login.codingdojo.com/m/315/9532/64276">jsp</a></td>
    </tr>
    <tr>
        <td>W2D1 </td>
        <td></td>
        <td></td>
        <td>Sessions & Form</td>
        <td> </td>
    </tr>
    <tr>
        <td>W2D2 </td>
        <td>4</td>
        <td>MVC</td>
        <td>API CRUD, Web Dashboard & Details</td>
        <td> require <a href="https://login.codingdojo.com/m/315/9533/64293">MySQL</a> </td>
    </tr>
    <tr>
        <td>W2D3 </td>
        <td></td>
        <td></td>
        <td>Web CRUD, Data binding (form:form)</td>
        <td> </td>
    </tr>
    <tr>
        <td> W2D4 </td>
        <td></td>
        <td>Relationships</td>
        <td>One-to-many notes</td>
        <td> </td>
    </tr>
    <tr>
        <td> W2D5 </td>
        <td>5</td>
        <td>Auth</td>
        <td>PseudoCode</td>
        <td> </td>
    </tr>
        <tr>
        <td>  </td>
        <td></td>
        <td>Full Spring with Auth</td>
        <td>Notes </td>
        <td> </td>
    </tr>
    </tbody>
</table>

## Eclipse Shortcut
| Windows | Mac    | Functions |
|----------------- | -----------------| --------------|
| Alt + Shift S  | Command + Option+ S| Open Source to create getter/setter|
| Ctrl + Shift+ O  | Command + Shift +O | Autoimport |
| Ctrl + Shift + T | Command + Shift + T| Open / Search for types, very useful in finding classes|
| Alt + up/down | Option + up/down | Move the line up / down |
| Ctrl + Shift + F| Command + Shift + F | Auto-format | 
|Alt + Shift + R|Command + Option + R|Rename of package, class etc|


## Common errors

### To kill a running port
1. run the first command to get the PID of the port
2. kill the port with the PID. 

    #### **Mac/Linux**
    - to getting the background process and find the PID
    ```lsof -i:8080 ```

    - To kill the PID
    ```kill -9 <PID> ```

    #### **Windows**
    - to getting the background process and find the PID
    ```netstat -ano | findstr :8080```
    - To kill the PID
    ```taskkill /PID <PID> /F ```

