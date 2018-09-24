package twg2.tuple.templates.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.stringtemplate.v4.ST;

import twg2.template.codeTemplate.ClassTemplate;
import twg2.template.codeTemplate.render.STTemplates;
import twg2.template.codeTemplate.render.TemplateImports;
import twg2.template.codeTemplate.render.TemplateRenderBuilder;

/**
 * @author TeamworkGuy2
 * @since 2015-8-6
 */
public class GenerateTuples {

	public static class TupleInfo extends ClassTemplate {
		public List<Integer> types = new ArrayList<>();
	}


	public static class TuplesInfo extends ClassTemplate {
		public List<List<Integer>> types = new ArrayList<>();
	}




	private static String tmplDir = "src.twg2.collections.templates".replace('.', '/') + '/';
	private static String pkgName = "twg2.collections.tuple";
	private static TemplateImports importsMapper = TemplateImports.emptyInst();


	public static void generateTuples() {
		int start = 2;
		int count = 3;

		generateTuplesUtil(start, count, "Tuples");

		IntStream.range(start, start + count).forEach((i) -> {
			generateTuple(i, "Tuple" + i);
		});
	}


	public static void generateTuplesUtil(int startIndex, int count, String name) {
		TuplesInfo info = new TuplesInfo();
		info.className = name;
		info.packageName = pkgName;

		@SuppressWarnings("unchecked")
		List<Integer>[] intRanges = IntStream.range(startIndex, startIndex + count).mapToObj((i) -> Arrays.asList(IntStream.range(0, i).boxed().toArray((s) -> new Integer[s]))).toArray((s) -> new List[s]);
		info.types = Arrays.asList(intRanges);

		ST stTmpl = STTemplates.fromFile(tmplDir + "TTuples.stg", "TTuples", importsMapper);
		TemplateRenderBuilder.newInst()
				.addParam("var", info)
				.writeDst(info)
				.render(stTmpl);
	}


	public static void generateTuple(int count, String name) {
		TupleInfo info = new TupleInfo();
		info.className = name;
		info.packageName = pkgName;

		if(count == 2) {
			info.implementClassNames = Arrays.asList("java.util.Map.Entry<A0, A1>");
		}

		info.types = Arrays.asList(IntStream.range(0, count).boxed().toArray((s) -> new Integer[s]));

		ST stTmpl = STTemplates.fromFile(tmplDir + "TTuple.stg", "TTuple", importsMapper);
		TemplateRenderBuilder.newInst()
				.addParam("var", info)
				.writeDst(info)
				.render(stTmpl);

	}


	public static void main(String[] args) {
		generateTuples();
	}

}
