## 判断
### if-else
```
int a = 40;
int b = 0;
if (a > 50){
  b = 100;
}
else{
  b=0;
}
```
### ternary
```
int a = 40;
int b = 0;
a = a>50 ? 100 : 0 ;
```
## 循环 
### FOR
```
for (int index = 0; index <10; index = index *2){
}
```
### FOR EACH
```
char[] array = {'A','B','C'};
for(char c : array){
}
```
### while
```
while(1){
}
```
### do-while
```
do{
}
while(1);
```

## Switch
### 格式
```
switch(var){
  case [case-value]:
    System.out.println("var Matched case-value");
    break;
  default:
    System.out.println("default module");
}
```
### 顺序
* 从上往下匹配
* 一旦匹配成功，则执行当前模块
* 如果当前模块包含break，则跳出switch
* 如果当前模块不包含break，则向下执行，直到遇到break 或者 到default模块
* 如果没有匹配成功，则执行default 模块
* default模块不需要break，因为是最后一个模块

### 选择变量 switch(var)
* 仅支持  int, short, char, byte and enum;
* 从JDK1.7开始 支持 String
* case 后只能跟常量，不能跟范围； 例如 :x: case 0-6


