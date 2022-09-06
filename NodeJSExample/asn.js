const fs = require('fs');
const path = require ('path');
/*fs.writeFile(path.join(__dirname,'/Training Details','/studentName.txt'),'Student data',(err)=>{
    if(err) throw err;
    console.log('File written to...');
}
)
fs.readFile(path.join(__dirname,'Training Details','/studentName.txt'),'utf8',(err,data)=>{
    if(err) throw err;
    console.log(data);
})*/

fs.readFile(path.join(__dirname,'../demo','/sample.java'),'utf8',(err,data)=>{
    if(err) throw err;
    console.log(data);
})