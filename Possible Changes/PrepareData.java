/*
 * Prepare dfr-browser data files from MALLET outputs.
 * An alternative to this script with more features can be found in the
 * export_browser_data function in this R package:
 * http://github.com/agoldst/dfrtopics
 * Usage:
 *    prepare-data check [<dir>]
 *        Check presence and format of data files in <dir> or PWD
 *    prepare-data info-stub [-o <file>]
 *        Write stub info.json to <file> or "info.json"
 *    prepare-data convert-citations ... [-o <file>] [--ids <ids>]
 *        Convert JSTOR DfR citations.tsv files ... into zipped metadata
 *        <file>: name of file to write ("meta.csv.zip" by default)
 *        <ids>: (optional) a file with one document ID per line. If
 *        supplied, these IDs are matched against the first column of the
 *        input metadata, and the output contains only matching documents
 *        (in the order given in <ids>).
 *    prepare-data convert-tw [-o <file>] <tw> --vocab <v> [--param <p>] [-n N]
 *        Write topic-word information to <file> or "tw.json"
 *        <tw>: CSV with topic-word matrix (headerless)
 *        <v>: vocabulary listing, one line per column of <tw>
 *        <p>: (optional) params.txt written by dfrtopics v0.2
 *            If this is missing, topic alpha values will be missing
 *        <n>: number of top words per topic (50 by default)
 *    prepare-data convert-keys [-o <file>] <keys>
 *        Write topic-word information to <file> or "tw.json"
 *        <keys>: CSV with topic,alpha,word,weight columns (from dfrtopics v0.1)
 *            or with topic,word,weight columns (from dfrtopics v0.2)
 *    prepare-data convert-dt [-o <file>] <dt>
 *        Write zipped document-topic information to <dt> or <dt.json.zip>
 *        <dt>: CSV with document-word weights (headerless).
 *            This ordinary matrix is converted to the required sparse format.
 *    prepare-data convert-state <state> [--tw <tw>] [--dt <dt>]
 *        Use the MALLET sampling state to write both topic words and document
 *        topics.
 *        <state>: gzipped file from mallet train-topics --output-state or
 *        dfrtopics::write_mallet_state
 *        <tw>: name of topic-word file to output ("tw.json" by default)
 *        <dt>: name of doc-topic file to output ("dt.json.zip" by default)
 *
 */

import java.util.regex;
// Need to find version of os
import java.io.File;
// Need to install a library for JSON
import java.util.zip.ZipFile;
import java.util.zip.GZIPOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import DefaultDict;

public class PrepareData {
	public PrepareData() {


	}

	boolean containsFile(String[] directories, String file) {
		for (int i = 0; i < directories.length, i++) {
			if (directories[i].equals(file)) {
				return true;
			}
		}
		return false;
	}

	void checkFiles(String d) {
		File file = new File("/path/to/directory");
		String[] directories = file.list(new FilenameFilter() {
  			@Override
  			public boolean accept(File current, String name) {
    			return new File(current, name).isDirectory();
  			}
		});
		System.out.println(Arrays.toString(directories));
		System.out.println("Checking info.json...");
		if (!(containsFile(directories, "info.json"))) {
			System.out.println("info.json not found. Use 'prepare-data info-stub' to create one");
		} else {

		}
		System.out.println("Checking meta.csv.zip...");
		if (containsFile(directories, "meta.csv.zip")) {

		} else {
			System.out.println("No meta.csv.zip found. Use 'prepare-data convert-citations' or DfR citations.tsv files.");
		}
		System.out.println("Checking topic_scaled.csv...");
		if (!(containsFile(directories, "topic_scaled.csv"))) {
			System.out.println("No topic_scaled.csv found. This file is required only for the 'scaled' overview.");
		} else {
			System.out.println("topic.scaled.csv: ok");
		}
		System.out.println("Checking tw.json");
		if (!(containsFile(directories, "tw.json"))) {
			System.out.println("No tw.json found.
								Use 'prepare-data convert-tw' on a topic-word matrix CSV or
								'prepare-data convert-keys' on a CSV listing top words and weights.");
		} else {

		}
		System.out.println("Checking dt.json.zip...");
		if (!(containsFile(directories, "dt.json.zip"))) {
			System.out.println("No dt.json.zip found.
								Use 'prepare-data convert-dt' on a document-topic matrix CSV.");
		} else {

		}

	}

	void infoStub(String out) {
		BufferedWriter out = null;
		FileWriter fstream = new FileWriter(out, true); 
    	out = new BufferedWriter(fstream);
    	// STUFF FOR THE JSON
    	System.out.println("Created stub file in " + out);
	}

	void convertCitations(File fs, String matchfile, String out) {
		ArrayList<String> ll = new ArrayList<>();
		DefaultDict<Integer, List<Integer>> inIds =
        	new DefaultDict<Integer, List<Integer>>(ArrayList.class);
        BufferedReader br = new BufferedReader(new FileReader(file));  
		String line = br.readLine();  
		while (line != null) {
			// STUFF
			line = br.readLine();
		}

		if (matchfile == null) {

		} else {

		}

		// WITH STUFF

		System.out.println("Wrote metadata to " + out);

	}

	void convertTW(String twf, String out, String vocabf, String paramf, int n) {
		ArrayList<> tw = new ArrayList<>();
		ArrayList<> vocab = new ArrayList<>();
		ArrayList<Integer> weights = new ArrayList<Integer>();
		ArrayList<Double> alpha = new ArrayList<Double>();

		BufferedReader br = new BufferedReader(new FileReader(file));  
		String line = br.readLine();  
		while (line != null) {
			// STUFF
			line = br.readLine();
		}

		br = new BufferedReader(new FileReader(file));  
		line = br.readLine();  
		while (line != null) {
			// STUFF
			line = br.readLine();
		}

		if (paramf == null) {

		} else {

		}

		//write_tw
		return;
	}

	HashMap<String, HashMap<String, Integer>> transformTopicWeights(HashMap<String, Integer> weightsVocab, int n) {
		return null;
	}

	//Need to find the types of the parameters
	//For now, leave blank
	void writeTW(ArrayList<Double> alpha, , String out) {
		
	}

	void convertKeys(String keysf, String out) {

	}

	void convertDT(String dtf, String out) {

	}

	HashMap<String, String[]> transformDT(String[] dt) {

	}

	//dtj is blank until I can find out what the type is
	void writeDT() {

	}

	void convertState(String statef, String twout, String dtout, int n) {

	}

	void help() {

	}

	String[] keyArg(String[] args, String key) {

	}
}