# Syllabus

## JAVA 
--------
- [ ] OOP 
  - [ ] 面向对象和面向过程
  - [ ] 封装
  - [ ] 多态性
  - [ ] 继承
- [ ] DATA TYPE
  - [ ] Primitive Types (基本类型）
  - [ ] Reference Types（引用类型)
- [ ] Controller
  - [ ] Condition (if else) (判断）
  - [ ] Loop (for, while) （循环）
- [ ] Access Scope
  - [ ] public, protected, private, friendly
- [ ] Initialization (初始化)
  - [ ] constructor (构造器)
    - [ ] default constructor ()
    - [ ] method overloading 
    - [ ] this
  - [ ] order (初始化顺序)
    - [ ] var ()
    - [ ] static
    - [ ] constructor
  - [ ] array initialize (数组)
  - [ ] enumerated types ( 枚举类)
- [ ] 抽象类和接口
  - [ ] extends 继承
  - [ ] 抽象类 abstract class : 包含抽象方法的类叫抽象类
    - [ ] 抽象方法前必须加abstract关键字
    - [ ] 因为包含有无具体实现的方法，所以不能实例化一个抽象类
    - [ ] 普通类继承抽象类时，必须实现所有抽象方法；否则子类也必须是抽象类
    - [ ] 抽象类不能是private
    - [ ] 抽象类可以继承抽象类，和普通类一样是单继承的
  - [ ] implements 实现
  - [ ] 接口
    - [ ] interface
    - [ ] 接口中所有方法都是抽象方法；接口中一般不定义变量，一旦定义会被隐性定义成static final(常量)
    - [ ] 非抽象了实现接口，必须实现接口中所有方法；抽象类可以不实现
    - [ ] 接口中方法默认是public，并且不可以private
    - [ ] 接口只能继承接口，且可以继承多个接口
    - [ ] 一个类可以实现多个接口  
- [ ] Container （集合类）
  - [ ] 
## SQL
--------
- [ ] Database Basic
  - [ ] relational (关系型数据库）
    - [ ] PRIMARY KEY（主键）
    - [ ] FOREGIN KEY (外键）
  - [ ] non-relational （非关系型数据库）
- [ ] SQL Basic
  - [ ] insert （增）
  - [ ] delete （删）
  - [ ] update （改）
  - [ ] select （查）
- [ ] SQL Advanced
  - [ ] join （LEFT, RIGHT, INNER, OUTER)
  - [ ] union
  - [ ] group by
- [ ] SQL Database
  - [ ] create DB/Table
  - [ ] drop DB/Table
  - [ ] alter Table
- [ ] 事务 (Transaction) 是构成单一逻辑工作单元的操作集合，要么完整的执行，要么完全不执行。不论发生何种情况，DBS(数据库系统)必须保证事务能正确完整地执行。
  - ACID 性质
    - [ ] A Atomicity 原子性 一个事务对数据库的所有操作，是一个不可分割的工作单元。
    - [ ] C Consistency 一致性 一个事务独立执行的结果，应保持数据库的一致性，即数据不会因事务的执行而遭受破坏。
    - [ ] I Isolation 隔离性 在多个事务并发执行时，系统应保证这些事务先后单独执行时的结果时一样。
    - [ ] D Durability 持久性 一个事务一旦完成全部操作后，它对数据库的所有更新应永久地反映在数据库中，不会丢失。
  - 事务的状态
    - [ ] 活动状态 事务开始执行后，进入活动状态。事务将执行对数据的读写操作。但是写操作不写入磁盘，可能暂时存放在系统缓冲区。
    - [ ] 局部提交 事物的最后一个语句执行后，进入局部提交状态。
    - [ ] 失败 处于活动状态的事务还没到达最后一个语句就中止执行，此时事务会进入失败状态； 或者处于局部提交状态的事务遇到故障（如发生干扰，或未能完成对数据库的修改），也将进入失败状态
    - [ ] 异常中止 失败状态的事务，可能已经对磁盘中的数据产生了修改。为了保证事务的原子性，应该撤销该事务对数据库已作的修改
       对事务的撤销也被称为事务的回退
    - [ ] 提交 事务进入局部提交状态后，检查通过后，对数据库的修改全部写到了磁盘上，并通知系统，事务成功的结束。进入提交状态
## Software Engineering & Testing （软件工程和测试）
--------
- [ ] TESTING Introduction
- [ ] Blackbox TESTING （黑盒测试）
- [ ] UI Automation (Selenium) （界面自动化）
- [ ] API Automation （Postman） (接口自动化）

### HTTP
--------
- [ ] 2XX 成功
- [ ] 3xx 重定向
- [ ] 4xx 请求错误
- [ ] 5xx 服务器错误
https://www.cnblogs.com/shanyou/archive/2012/05/06/2486134.html 
## OTHER
--------
- [ ] git and github
- [ ] jira
