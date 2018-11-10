|          | public | protected | friendly | private |
| -------- | ------ | --------- | -------- | ------- |
|class 内  | Access | Access    | Access   | Access  |
|package 内| Access | Access    | Access   | Deny    |
|package 外的非子类| Access | Deny      | Deny     | Deny    |
|package 外的子类  | Access | Access    | Deny   | Deny    |

* package外，需要先import package
