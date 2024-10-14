## One of ViewModel feature:
- help to maintenance our app like such as screen rotation and handle data

## Guide
1. create new empty views activity
2. go to res > layout > activity_main.xml
3. add some text and button count
4. Create ViewModel class
5. Extend its module class
6. Give constructor invocation
7. To handle the data itself, iniatilize viewModel with viewModelProvider(this).get(YOURCLASS::class.java)

### Note
- You must to create new class for viewModel because it will keep or handle the data when it is rotated (simple case)
