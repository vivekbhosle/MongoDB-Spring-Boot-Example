package com.costcotravel.mongodbboot;

import java.net.UnknownHostException;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;

public class MongoDBUpdateExample {

	public static void main(String[] args) throws UnknownHostException {

		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase db = mongo.getDatabase("rest_tutorial");

		MongoCollection<Document> col = db.getCollection("pets");

		/**
		 * Test Data - Before update > db.pets.find() {"_id":"5c6fb92aaf2e580ef4b0a8fd","name":"Spot","species":"dog","breed":"pitbull"} >
		 */

		// Remove a field in a single document
		Bson filter = Filters.eq("name", "Spot");
		Document document = new Document("$unset", new Document("species", ""));

		UpdateResult result = col.updateOne(filter, document);

		if(result.getMatchedCount() == 1) {
			System.out.println("deleted");
		}
		else {
			System.out.println("not deleted");
		}

		/**
		 * Test Data - After update > db.pets.find() {"_id":"5c6fb92aaf2e580ef4b0a8fd","name":"Spot","breed":"pitbull"}
		 */

		mongo.close();

	}

}
