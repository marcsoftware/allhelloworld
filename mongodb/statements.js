mongosh
show dbs
use appdb
use nameofanewdatabase
show collections
db.dropDatabase()
show dbs
cls
exit
mongosh
db //show current database
db.users.insertOne({name:"john"})
db.users.find()
// documnet > collectoins > database
db.users.insertOne({name:"sally",age:19,address:{strret:"103 fake street},hobbies:{"running"});
db.users.find();
db.suers.insertMany({name:"jill"},{name:"mike"});
db.users.find().limit(2)
db.users.find().sort({name:1}).limit(2)
db.users.find().sort({name:-1}).limit(2)
db.users.find().sort({age:1,name:-1}).limit(2)
db.users.find().skip(1).limit(2)
db.users.find({name:"kyle"})
db.users.find({age:26})
db.users.find({age:"26"}) // wont work
db.users.find({name:"kyle"},{name:1,age:1})
db.users.find({name:"kyle"},{name:1,age:1,_id:0})
db.users.find({name:"kyle"},{age:0}) // get all fields except age
db.users.find({name:{$eq:"sally"} })
db.users.find({name:{$ne:"sally"} })
db.users.find({age:{$gt:13} })
db.users.find({age:{$gte:19} })
db.users.find({age:{$lte:19} })
db.users.find({age:{$lt:19} })
db.users.find({name:{$in:["sally","kyle"]} })
db.users.find({name:{$nin:["sally","kyle"]} })
db.users.find({age:{$exists:true} }) // nulls will still be retrieved
db.users.find({age:{$exists:false} }) // if the key does not exist at all
db.users.insertOne({age:null,name:"bill"})
db.users.find({age:{$lte:40,$gte:20} })
db.users.find({age:{$lte:40,$gte:20},name:"sally" })
db.users.find({$and:[{age:26},{name:"kyle"}]})
db.users.find({$or:[{age:26},{name:"kyle"}]})
db.users.find({age:{$not:{$lte:20}}})
db.users.insertMany([{name:"tom",balace:100,debt:200},{name:"kristin",balance:20,debt:0}]);
db.users.find({$expr:{$gt:["debt","balance"]}) //wont work
db.users.find({$expr:{$gt:["$debt","$balance"]}) 
db.users.find({"address.street":"123 main st"})
db.users.findOne({age:{$lte:40}})
db.users.countDocuments({age:{$lte:40}})
db.uers.updateOne({age:26},{age:27})// wont work
db.uers.updateOne({age:26},{$set:{age:27}})
db.users.updateOne({_id:ObjectId("123456789")},{$set:{name:"new name"}});
db.users.updateOne({_id:ObjectId("123456789")},{$inc:{age:3}});
db.users.updateOne({_id:ObjectId("123456789")},{$rename:{name:"firstname"}});
db.users.updateOne({_id:ObjectId("123456789")},{$unset:{age:""}});
db.users.updateOne({_id:ObjectId("123456789")},{$push:{hobbies:"swimming"}});
db.users.updateOne({_id:ObjectId("123456789")},{$pull:{hobbies:"swimming"}});// remove from array
db.users.updateMany({address:{$exists:true}},{$unset:{address:""}});
db.users.replaceOne({age:30},{name:"john"}) // delete whole object?

db.users.deleteOne({name:"john"})
db.users.deleteMany({age:{$exists:false}})