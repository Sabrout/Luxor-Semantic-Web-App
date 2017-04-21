import org.apache.jena.iri.impl.Main;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileManager;

public class ExamlpleQuery {
	public static void main(String[] args) {
		FileManager.get().addLocatorClassLoader(ExamlpleQuery.class.getClassLoader());
		Model m = FileManager.get().loadModel("TouristOntoRDF.owl");
		String ontologyPrefix = "PREFIX onto: <http://www.semanticweb.org/mohamed/ontologies/2017/2/TouristOnto>";
		String queryString = ontologyPrefix + "SELECT ?city ?season WHERE { ?city onto:season ?season}";
		Query query = QueryFactory.create(queryString);
		QueryExecution qexec = QueryExecutionFactory.create(query, m);
		try {
			ResultSet results = qexec.execSelect();
			while (results.hasNext()) {
				QuerySolution soln = results.nextSolution();
				System.out.println(soln.toString());
			}
		} finally {
			qexec.close();
		}
	}
}
