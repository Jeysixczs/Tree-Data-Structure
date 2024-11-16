## Guide 101

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.


Here's the list of Operation 

### Post-Order Code


                          post(nodes.left); 

                          post(nodes.right); 

                          System.out.print(nodes.value + " ");

---
### In-Order Code


                          post(nodes.left);

                          System.out.print(nodes.value + " ");

                          post(nodes.right); 

---
### Pre-Order


                          System.out.print(nodes.value + " ");

                          post(nodes.left); 

                          post(nodes.right); 
