public class Part1 {
    public String findSimpleGene (String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "ATG codon not found";
        }
        int endIndex = dna.indexOf("TAA", startIndex + 3);
        if (endIndex == -1) {
            return "TTA codon not found";
        }
        if ((endIndex - startIndex) % 3 != 0) {
            return "Invalid gene";
        }
        result = dna.substring(startIndex, endIndex + 3);
        return "Gene is " + result;
    }
    
    public void testSimpleGene () {
        String dna = "AAATGCCCTAACTAGATTAAGAAACC"; // no ATG
        System.out.println("DNA Strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println(gene);
        
    }
}
