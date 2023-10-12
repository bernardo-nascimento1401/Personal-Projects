import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Sharing
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        ArrayList<People> orange_county = new ArrayList<People>();
        final int ORANGE_COUNTY = 3186989;
        People[] orangecountypop = new People [ORANGE_COUNTY];
        for (int i = 0; i <= ORANGE_COUNTY - 1; i++)
        {
            orangecountypop [i] = new People("i", false);
            orange_county.add(orangecountypop [i]);
        }        

        ArrayList<People> la_county = new ArrayList<People>();
        final int LA_COUNTY = 9861224 ;
        People[] lacountypop = new People [LA_COUNTY];
        for (int i = 0; i <= LA_COUNTY - 1; i++)
        {
            lacountypop [i] = new People("i", false);
            la_county.add(lacountypop [i]);
        }        

        ArrayList<People> sandiego_county = new ArrayList<People>();
        final int SANDIEGO_COUNTY = 3298634;
        People[] sandiegopop = new People [SANDIEGO_COUNTY];
        for (int i = 0; i <= SANDIEGO_COUNTY - 1; i++)
        {
            sandiegopop [i] = new People("i", false);
            sandiego_county.add(sandiegopop [i]);
        }        

        ArrayList<People> riverside_county = new ArrayList<People>();
        final int RIVERSIDE_COUNTY = 2458395;
        People[] riversidepop = new People [RIVERSIDE_COUNTY];
        for (int i = 0; i <= RIVERSIDE_COUNTY - 1; i++)
        {
            riversidepop [i] = new People("i", false);
            riverside_county.add(riversidepop [i]);
        }

        ArrayList<People> sanbernardino_county = new ArrayList<People>();
        final int SANBERNADINO_COUNTY = 2194710;
        People[] sanbernardinopop = new People [SANBERNADINO_COUNTY];
        for (int i = 0; i <= SANBERNADINO_COUNTY - 1; i++)
        {
            sanbernardinopop [i] = new People("i", false);
            sanbernardino_county.add(sanbernardinopop [i]);
        } 

        ArrayList<People> santaclara_county = new ArrayList<People>();
        final int SANTACLARA_COUNTY = 1885508;
        People[] santaclarapop = new People [SANTACLARA_COUNTY];
        for (int i = 0; i <= SANTACLARA_COUNTY - 1; i++)
        {
            santaclarapop [i] = new People("i", false);
            santaclara_county.add(santaclarapop [i]);
        } 

        ArrayList<People> alameda_county = new ArrayList<People>();
        final int ALAMEDA_COUNTY = 1648556;
        People[] alamedapop = new People [ALAMEDA_COUNTY];
        for (int i = 0; i <= ALAMEDA_COUNTY - 1; i++)
        {
            alamedapop [i] = new People("i", false);
            alameda_county.add(alamedapop [i]);
        }  

        ArrayList<People> sacramento_county = new ArrayList<People>();
        final int SACRAMENTO_COUNTY = 1588921;
        People[] sacramentopop = new People [SACRAMENTO_COUNTY];
        for (int i = 0; i <= SACRAMENTO_COUNTY - 1; i++)
        {
            sacramentopop [i] = new People("i", false);
            sacramento_county.add(sacramentopop [i]);
        }  

        ArrayList<People> contracosta_county = new ArrayList<People>();
        final int CONTRACOSTA_COUNTY = 1161413;
        People[] contracostapop = new People [CONTRACOSTA_COUNTY];
        for (int i = 0; i <= CONTRACOSTA_COUNTY - 1; i++)
        {
            contracostapop [i] = new People("i", false);
            contracosta_county.add(contracostapop [i]);
        }  

        ArrayList<People> fresno_county = new ArrayList<People>();
        final int FRESNO_COUNTY = 1013581;
        People[] fresnopop = new People [FRESNO_COUNTY];
        for (int i = 0; i <= FRESNO_COUNTY - 1; i++)
        {
            fresnopop [i] = new People("i", false);
            fresno_county.add(fresnopop [i]);
        }  

        ArrayList<People> kern_county = new ArrayList<People>();
        final int KERN_COUNTY = 917673;
        People[] kernpop = new People [KERN_COUNTY];
        for (int i = 0; i <= KERN_COUNTY - 1; i++)
        {
            kernpop [i] = new People("i", false);
            kern_county.add(kernpop [i]);
        }  

        ArrayList<People> ventura_county = new ArrayList<People>();
        final int VENTURA_COUNTY = 839784;
        People[] venturapop = new People [VENTURA_COUNTY];
        for (int i = 0; i <= VENTURA_COUNTY - 1; i++)
        {
            venturapop [i] = new People("i", false);
            ventura_county.add(venturapop [i]);
        }  

        ArrayList<People> sanfrancisco_county = new ArrayList<People>();
        final int SANFRANCISCO_COUNTY = 815201;
        People[] sanfranciscopop = new People [SANFRANCISCO_COUNTY];
        for (int i = 0; i <= SANFRANCISCO_COUNTY - 1; i++)
        {
            sanfranciscopop [i] = new People("i", false);
            sanfrancisco_county.add(sanfranciscopop [i]);
        }  

        ArrayList<People> sanjoaquin_county = new ArrayList<People>();
        final int SANJOAQUIN_COUNTY = 789410;
        People[] sanjoaquinpop = new People [SANJOAQUIN_COUNTY];
        for (int i = 0; i <= SANJOAQUIN_COUNTY - 1; i++)
        {
            sanjoaquinpop [i] = new People("i", false);
            sanjoaquin_county.add(sanjoaquinpop [i]);
        }  

        ArrayList<People> sanmateo_county = new ArrayList<People>();
        final int SANMATEO_COUNTY = 737888;
        People[] sanmateopop = new People [SANMATEO_COUNTY];
        for (int i = 0; i <= SANMATEO_COUNTY - 1; i++)
        {
            sanmateopop [i] = new People("i", false);
            sanmateo_county.add(sanmateopop [i]);
        }  

        ArrayList<People> stanislaus_county = new ArrayList<People>();
        final int STANISLAUS_COUNTY = 552999;
        People[] stanislauspop = new People [STANISLAUS_COUNTY];
        for (int i = 0; i <= STANISLAUS_COUNTY - 1; i++)
        {
            stanislauspop [i] = new People("i", false);
            stanislaus_county.add(stanislauspop [i]);
        }  

        ArrayList<People> sonoma_county = new ArrayList<People>();
        final int SONOMA_COUNTY = 485887;
        People[] sonomapop = new People [SONOMA_COUNTY];
        for (int i = 0; i <= SONOMA_COUNTY - 1; i++)
        {
            sonomapop [i] = new People("i", false);
            sonoma_county.add(sonomapop [i]);
        }  

        ArrayList<People> tulare_county = new ArrayList<People>();
        final int TULARE_COUNTY = 477054;
        People[] tularepop = new People [TULARE_COUNTY];
        for (int i = 0; i <= TULARE_COUNTY - 1; i++)
        {
            tularepop [i] = new People("i", false);
            tulare_county.add(tularepop [i]);
        }  

        ArrayList<People> solano_county = new ArrayList<People>();
        final int SOLANO_COUNTY = 451716;
        People[] solanopop = new People [SOLANO_COUNTY];
        for (int i = 0; i <= SOLANO_COUNTY - 1; i++)
        {
            solanopop [i] = new People("i", false);
            solano_county.add(solanopop [i]);
        }  

        ArrayList<People> santabarbara_county = new ArrayList<People>();
        final int SANTABARBARA_COUNTY = 446475;
        People[] santabarbarapop = new People [SANTABARBARA_COUNTY];
        for (int i = 0; i <= SANTABARBARA_COUNTY - 1; i++)
        {
            santabarbarapop [i] = new People("i", false);
            santabarbara_county.add(santabarbarapop [i]);
        }  

        ArrayList<People> monterey_county = new ArrayList<People>();
        final int MONTEREY_COUNTY = 437325;
        People[] montereypop = new People [MONTEREY_COUNTY];
        for (int i = 0; i <= MONTEREY_COUNTY - 1; i++)
        {
            montereypop [i] = new People("i", false);
            monterey_county.add(montereypop [i]);
        }  

        ArrayList<People> placer_county = new ArrayList<People>();
        final int PLACER_COUNTY = 412300;
        People[] placerpop = new People [PLACER_COUNTY];
        for (int i = 0; i <= PLACER_COUNTY - 1; i++)
        {
            placerpop [i] = new People("i", false);
            placer_county.add(placerpop [i]);
        }  

        ArrayList<People> merced_county = new ArrayList<People>();
        final int MERCED_COUNTY = 286461;
        People[] mercedpop = new People [MERCED_COUNTY];
        for (int i = 0; i <= MERCED_COUNTY - 1; i++)
        {
            mercedpop [i] = new People("i", false);
            merced_county.add(mercedpop [i]);
        } 

        ArrayList<People> sanluisobispo_county = new ArrayList<People>();
        final int SANLUISOBISPO_COUNTY = 283159;
        People[] sanluisobispopop = new People [SANLUISOBISPO_COUNTY];
        for (int i = 0; i <= SANLUISOBISPO_COUNTY - 1; i++)
        {
            sanluisobispopop [i] = new People("i", false);
            sanluisobispo_county.add(sanluisobispopop [i]);
        } 

        ArrayList<People> santacruz_county = new ArrayList<People>();
        final int SANTACRUZ_COUNTY = 267792;
        People[] santacruzpop = new People [SANTACRUZ_COUNTY];
        for (int i = 0; i <= SANTACRUZ_COUNTY - 1; i++)
        {
            santacruzpop [i] = new People("i", false);
            santacruz_county.add(santacruzpop [i]);
        } 

        ArrayList<People> marin_county = new ArrayList<People>();
        final int MARIN_COUNTY = 260206;
        People[] marinpop = new People [MARIN_COUNTY];
        for (int i = 0; i <= MARIN_COUNTY - 1; i++)
        {
            marinpop [i] = new People("i", false);
            marin_county.add(marinpop [i]);
        } 

        ArrayList<People> yolo_county = new ArrayList<People>();
        final int YOLO_COUNTY = 216986;
        People[] yolopop = new People [YOLO_COUNTY];
        for (int i = 0; i <= YOLO_COUNTY - 1; i++)
        {
            yolopop [i] = new People("i", false);
            yolo_county.add(yolopop [i]);
        } 

        ArrayList<People> butte_county = new ArrayList<People>();
        final int BUTTE_COUNTY = 208309;
        People[] buttepop = new People [BUTTE_COUNTY];
        for (int i = 0; i <= BUTTE_COUNTY - 1; i++)
        {
            buttepop [i] = new People("i", false);
            butte_county.add(buttepop [i]);
        } 

        ArrayList<People> eldorado_county = new ArrayList<People>();
        final int ELDORADO_COUNTY = 193221;
        People[] eldoradopop = new People [ELDORADO_COUNTY];
        for (int i = 0; i <= ELDORADO_COUNTY - 1; i++)
        {
            eldoradopop [i] = new People("i", false);
            eldorado_county.add(eldoradopop [i]);
        } 

        ArrayList<People> shasta_county = new ArrayList<People>();
        final int SHASTA_COUNTY = 182139;
        People[] shastapop = new People [SHASTA_COUNTY];
        for (int i = 0; i <= SHASTA_COUNTY - 1; i++)
        {
            shastapop [i] = new People("i", false);
            shasta_county.add(shastapop [i]);
        } 

        ArrayList<People> imperial_county = new ArrayList<People>();
        final int IMPERIAL_COUNTY = 179851;
        People[] imperialpop = new People [IMPERIAL_COUNTY];
        for (int i = 0; i <= IMPERIAL_COUNTY - 1; i++)
        {
            imperialpop [i] = new People("i", false);
            imperial_county.add(imperialpop [i]);
        } 

        ArrayList<People> madera_county = new ArrayList<People>();
        final int MADERA_COUNTY = 159410;
        People[] maderapop = new People [MADERA_COUNTY];
        for (int i = 0; i <= MADERA_COUNTY - 1; i++)
        {
            maderapop [i] = new People("i", false);
            madera_county.add(maderapop [i]);
        }

        ArrayList<People> kings_county = new ArrayList<People>();
        final int KINGS_COUNTY = 153443;
        People[] kingspop = new People [KINGS_COUNTY];
        for (int i = 0; i <= KINGS_COUNTY - 1; i++)
        {
            kingspop [i] = new People("i", false);
            kings_county.add(kingspop [i]);
        } 

        ArrayList<People> humboldt_county = new ArrayList<People>();
        final int HUMBOLDT_COUNTY = 136310;
        People[] humboldtpop = new People [HUMBOLDT_COUNTY];
        for (int i = 0; i <= HUMBOLDT_COUNTY - 1; i++)
        {
            humboldtpop [i] = new People("i", false);
            humboldt_county.add(humboldtpop [i]);
        } 

        ArrayList<People> napa_county = new ArrayList<People>();
        final int NAPA_COUNTY = 136207;
        People[] napapop = new People [NAPA_COUNTY];
        for (int i = 0; i <= NAPA_COUNTY - 1; i++)
        {
            napapop [i] = new People("i", false);
            napa_county.add(napapop [i]);
        } 

        ArrayList<People> nevada_county = new ArrayList<People>();
        final int NEVADA_COUNTY = 103487;
        People[] nevadapop = new People [NEVADA_COUNTY];
        for (int i = 0; i <= NEVADA_COUNTY - 1; i++)
        {
            nevadapop [i] = new People("i", false);
            nevada_county.add(nevadapop [i]);
        } 

        ArrayList<People> sutter_county = new ArrayList<People>();
        final int SUTTER_COUNTY = 99063;
        People[] sutterpop = new People [SUTTER_COUNTY];
        for (int i = 0; i <= SUTTER_COUNTY - 1; i++)
        {
            sutterpop [i] = new People("i", false);
            sutter_county.add(sutterpop [i]);
        } 

        ArrayList<People> mendocino_county = new ArrayList<People>();
        final int MENDOCINO_COUNTY = 91305;
        People[] mendocinopop = new People [MENDOCINO_COUNTY];
        for (int i = 0; i <= MENDOCINO_COUNTY - 1; i++)
        {
            mendocinopop [i] = new People("i", false);
            mendocino_county.add(mendocinopop [i]);
        } 

        ArrayList<People> yuba_county = new ArrayList<People>();
        final int YUBA_COUNTY = 83421;
        People[] yubapop = new People [YUBA_COUNTY];
        for (int i = 0; i <= YUBA_COUNTY - 1; i++)
        {
            yubapop [i] = new People("i", false);
            yuba_county.add(yubapop [i]);
        } 

        ArrayList<People> lake_county = new ArrayList<People>();
        final int LAKE_COUNTY = 68766;
        People[] lakepop = new People [LAKE_COUNTY];
        for (int i = 0; i <= LAKE_COUNTY - 1; i++)
        {
            lakepop [i] = new People("i", false);
            lake_county.add(lakepop [i]);
        } 

        ArrayList<People> sanbenito_county = new ArrayList<People>();
        final int SANBENITO_COUNTY = 66677;
        People[] sanbenitopop = new People [SANBENITO_COUNTY];
        for (int i = 0; i <= SANBENITO_COUNTY - 1; i++)
        {
            sanbenitopop [i] = new People("i", false);
            sanbenito_county.add(sanbenitopop [i]);
        } 

        ArrayList<People> tehama_county = new ArrayList<People>();
        final int TEHAMA_COUNTY = 65498;
        People[] tehamapop = new People [TEHAMA_COUNTY];
        for (int i = 0; i <= TEHAMA_COUNTY - 1; i++)
        {
            tehamapop [i] = new People("i", false);
            tehama_county.add(tehamapop [i]);
        } 

        ArrayList<People> tuolumne_county = new ArrayList<People>();
        final int TUOLUMNE_COUNTY = 55810;
        People[] tuolumnepop = new People [TUOLUMNE_COUNTY];
        for (int i = 0; i <= TUOLUMNE_COUNTY - 1; i++)
        {
            tuolumnepop [i] = new People("i", false);
            tuolumne_county.add(tuolumnepop [i]);
        } 

        ArrayList<People> calaveras_county = new ArrayList<People>();
        final int CALAVERAS_COUNTY = 46221;
        People[] calaveraspop = new People [CALAVERAS_COUNTY];
        for (int i = 0; i <= CALAVERAS_COUNTY - 1; i++)
        {
            calaveraspop [i] = new People("i", false);
            calaveras_county.add(calaveraspop [i]);
        } 

        ArrayList<People> sisikiyou_county = new ArrayList<People>();
        final int SISIKIYOU_COUNTY = 44118;
        People[] sisikiyoupop = new People [SISIKIYOU_COUNTY];
        for (int i = 0; i <= SISIKIYOU_COUNTY - 1; i++)
        {
            sisikiyoupop [i] = new People("i", false);
            sisikiyou_county.add(sisikiyoupop [i]);
        } 

        ArrayList<People> amador_county = new ArrayList<People>();
        final int AMADOR_COUNTY = 41259;
        People[] amadorpop = new People [AMADOR_COUNTY];
        for (int i = 0; i <= AMADOR_COUNTY - 1; i++)
        {
            amadorpop [i] = new People("i", false);
            amador_county.add(amadorpop [i]);
        } 

        ArrayList<People> lassen_county = new ArrayList<People>();
        final int LASSEN_COUNTY = 33159;
        People[] lassenpop = new People [LASSEN_COUNTY];
        for (int i = 0; i <= LASSEN_COUNTY - 1; i++)
        {
            lassenpop [i] = new People("i", false);
            lassen_county.add(lassenpop [i]);
        } 

        ArrayList<People> glenn_county = new ArrayList<People>();
        final int GLENN_COUNTY = 28805;
        People[] glennpop = new People [GLENN_COUNTY];
        for (int i = 0; i <= GLENN_COUNTY - 1; i++)
        {
            glennpop [i] = new People("i", false);
            glenn_county.add(glennpop [i]);
        } 

        ArrayList<People> delnorte_county = new ArrayList<People>();
        final int DELNORTE_COUNTY = 28100;
        People[] delnortepop = new People [DELNORTE_COUNTY];
        for (int i = 0; i <= DELNORTE_COUNTY - 1; i++)
        {
            delnortepop [i] = new People("i", false);
            delnorte_county.add(delnortepop [i]);
        } 

        ArrayList<People> colusa_county = new ArrayList<People>();
        final int COLUSA_COUNTY = 21917;
        People[] colusapop = new People [COLUSA_COUNTY];
        for (int i = 0; i <= COLUSA_COUNTY - 1; i++)
        {
            colusapop [i] = new People("i", false);
            colusa_county.add(colusapop [i]);
        } 

        ArrayList<People> plumas_county = new ArrayList<People>();
        final int PLUMAS_COUNTY = 19915;
        People[] plumaspop = new People [PLUMAS_COUNTY];
        for (int i = 0; i <= PLUMAS_COUNTY - 1; i++)
        {
            plumaspop [i] = new People("i", false);
            plumas_county.add(plumaspop [i]);
        } 

        ArrayList<People> inyo_county = new ArrayList<People>();
        final int INYO_COUNTY = 18970;
        People[] inyopop = new People [INYO_COUNTY];
        for (int i = 0; i <= INYO_COUNTY - 1; i++)
        {
            inyopop [i] = new People("i", false);
            inyo_county.add(inyopop [i]);
        } 

        ArrayList<People> mariposa_county = new ArrayList<People>();
        final int MARIPOSA_COUNTY = 17147;
        People[] mariposapop = new People [MARIPOSA_COUNTY];
        for (int i = 0; i <= MARIPOSA_COUNTY - 1; i++)
        {
            mariposapop [i] = new People("i", false);
            mariposa_county.add(mariposapop [i]);
        } 

        ArrayList<People> trinity_county = new ArrayList<People>();
        final int TRINITY_COUNTY = 16060;
        People[] trinitypop = new People [TRINITY_COUNTY];
        for (int i = 0; i <= TRINITY_COUNTY - 1; i++)
        {
            trinitypop [i] = new People("i", false);
            trinity_county.add(trinitypop [i]);
        } 

        ArrayList<People> mono_county = new ArrayList<People>();
        final int MONO_COUNTY = 13247;
        People[] monopop = new People [MONO_COUNTY];
        for (int i = 0; i <= MONO_COUNTY - 1; i++)
        {
            monopop [i] = new People("i", false);
            mono_county.add(monopop [i]);
        } 

        ArrayList<People> modoc_county = new ArrayList<People>();
        final int MODOC_COUNTY = 8661;
        People[] modocpop = new People [MODOC_COUNTY];
        for (int i = 0; i <= MODOC_COUNTY - 1; i++)
        {
            modocpop [i] = new People("i", false);
            modoc_county.add(modocpop [i]);
        } 

        ArrayList<People> sierra_county = new ArrayList<People>();
        final int SIERRA_COUNTY = 3283;
        People[] sierrapop = new People [SIERRA_COUNTY];
        for (int i = 0; i <= SIERRA_COUNTY - 1; i++)
        {
            sierrapop [i] = new People("i", false);
            sierra_county.add(sierrapop [i]);
        } 

        ArrayList<People> alpine_county = new ArrayList<People>();
        final int ALPINE_COUNTY = 1235;
        People[] alpinepop = new People [ALPINE_COUNTY];
        for (int i = 0; i <= ALPINE_COUNTY - 1; i++)
        {
            alpinepop [i] = new People("i", false);
            alpine_county.add(alpinepop [i]);
        } 

        int sum = 0;
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<ArrayList<People>> counties = new ArrayList<ArrayList<People>>();
        counties.add(orange_county);
        names.add("Orange County");
        counties.add(la_county);
        names.add("Los Angeles County");
        counties.add(sandiego_county);
        names.add("San Diego County");
        counties.add(riverside_county);
        names.add("Riverside County");
        counties.add(sanbernardino_county);
        names.add("San Bernardino County");
        counties.add(santaclara_county);
        names.add("Santa Clara County");
        counties.add(alameda_county);
        names.add("Alameda County");
        counties.add(sacramento_county);
        names.add("Sacramento County");
        counties.add(contracosta_county);
        names.add("Conta Costa County");
        counties.add(fresno_county);
        names.add("Fresno County");
        counties.add(kern_county);
        names.add("Kern County");
        counties.add(ventura_county);
        names.add("Ventura County");
        counties.add(sanfrancisco_county);
        names.add("San Francisco County");
        counties.add(sanjoaquin_county);
        names.add("San Joaquin County");
        counties.add(sanmateo_county);
        names.add("San Mateo County");
        counties.add(stanislaus_county);
        names.add("Stanislaus County");
        counties.add(sonoma_county);
        names.add("Sonoma County");
        counties.add(tulare_county);
        names.add("Tulare County");
        counties.add(solano_county);
        names.add("Solano County");
        counties.add(santabarbara_county);
        names.add("Santa Barbara County");  
        counties.add(monterey_county);
        names.add("Monterey County");
        counties.add(placer_county);
        names.add("Placer County");
        counties.add(merced_county);
        names.add("Merced County");
        counties.add(sanluisobispo_county);
        names.add("San Luis Obispo County");
        counties.add(santacruz_county);
        names.add("Santa Cruz County");
        counties.add(marin_county);
        names.add("Marin County");
        counties.add(yolo_county);
        names.add("Yolo County");
        counties.add(butte_county);
        names.add("Butte County");
        counties.add(eldorado_county);
        names.add("El Dorado County");
        counties.add(shasta_county);
        names.add("Shasta County");
        counties.add(imperial_county);
        names.add("Imperial County");
        counties.add(madera_county);
        names.add("Madera County");
        counties.add(kings_county);
        names.add("Kings County");
        counties.add(humboldt_county);
        names.add("Humboldt County");
        counties.add(napa_county);
        names.add("Napa County");
        counties.add(nevada_county);
        names.add("Nevada County");
        counties.add(sutter_county);
        names.add("Sutter County");
        counties.add(mendocino_county);
        names.add("Mendocino County");
        counties.add(yuba_county);
        names.add("Yuba County");
        counties.add(lake_county);
        names.add("Lake County");
        counties.add(sanbenito_county);
        names.add("San Benito County");
        counties.add(tehama_county);
        names.add("Tehama County");
        counties.add(calaveras_county);
        names.add("Calaveras County");
        counties.add(sisikiyou_county);
        names.add("Sisikiyou County");
        counties.add(amador_county);
        names.add("Amador County");
        counties.add(lassen_county);
        names.add("Lassen County");
        counties.add(glenn_county);
        names.add("Glenn County");
        counties.add(delnorte_county);
        names.add("Del Norte County");
        counties.add(colusa_county);
        names.add("Colusa County");
        counties.add(plumas_county);
        names.add("Plumas County");
        counties.add(inyo_county);
        names.add("Inyo County");
        counties.add(mariposa_county);
        names.add("Mariposa County");
        counties.add(trinity_county);
        names.add("Trinity County");
        counties.add(mono_county);
        names.add("Mono County");
        counties.add(modoc_county);
        names.add("Modoc County");
        counties.add(sierra_county);
        names.add("Sierra County");
        counties.add(alpine_county);
        names.add("Alpine County");

        ArrayList<County> final_counties = new ArrayList<County>();

        /*
        int case0 = gen.nextInt(counties.size());
        int case02 = gen.nextInt(counties.get(case0).size());
        counties.get(case0).get(case02).setReceived(true);
        */
       
        int case0 = 0;
        int case02 = gen.nextInt(names.size());
        int size = counties.get(case02).size();
        counties.get(case02).get(gen.nextInt(size)).setReceived(true);
        System.out.println("Case 0 was in " + names.get(case02));
        int county = 0;
        int newcase = 0;
        boolean unreceived = false;
        boolean different = true;
        String stop = " ";
        int countychoice = 0;
        int choice = 0;
        int probability;
        final int CALIFORNIA_POP = 39538223 ;
        int max = 0;
        String maxname = "";
        int maxpopulation = 0;
        int maxposition = 0;

        for (int count = 0; count <= names.size() - 1; count++)         
            System.out.println(names.get(count) + ": 0");

        System.out.println();

        while (stop != "stop")
        {
            for (int countynum = 0; countynum <= counties.size()-1; countynum++)
            {
                for (int count = 0; count <= counties.get(countynum).size()-1; count++)
                {
                    for (int count2 = 0; count2 <= 4; count2++)
                    {
                        if (counties.get(countynum).get(count).getReceived() == true)
                        {
                            unreceived = false;
                            while (unreceived == false)
                            {
                                county = gen.nextInt(100)+1;
                                if (county < 95)
                                {
                                    newcase = gen.nextInt(counties.get(countynum).size());
                                    if (counties.get(countynum).get(newcase).getReceived() == false)
                                    {
                                        counties.get(countynum).get(newcase).setReceived(true);
                                        unreceived = true;
                                    }
                                }         

                                if (county > 95 && county <= 100)
                                {
                                    countychoice = countynum;
                                    different = true;
                                    while (countychoice == countynum)  
                                    {
                                        choice = gen.nextInt(counties.size()); 
                                        probability = gen.nextInt(100000) + 1;
                                        if (probability > 0 && probability < (((counties.get(choice).size()) / ((double) CALIFORNIA_POP)) * 100000))
                                            countychoice = choice;                                            
                                        else
                                            countychoice = countynum;
                                    }

                                    newcase = gen.nextInt(counties.get(countychoice).size());
                                    if (counties.get(countychoice).get(newcase).getReceived() == false)
                                    {
                                        counties.get(countychoice).get(newcase).setReceived(true);
                                        unreceived = true;
                                    }
                                }
                            }
                        }
                    }
                    counties.get(countynum).get(count).setReceived(false);
                }
                System.out.println((countynum + 1) + " counties calculated!");
            }

            County[] individual_counties = new County [counties.size()];
            for (int i = 0; i <= names.size() - 1; i++)
            {
                individual_counties [i] = new County(names.get(i), 0, counties.get(i).size());
                final_counties.add(individual_counties [i]);
            }

            for (int count = 0; count <= counties.size() - 1; count++)
            {
                sum = 0;
                for (int count1 = 0; count1 <= counties.get(count).size() - 1; count1++)
                {
                    if (counties.get(count).get(count1).getReceived() == true)
                        sum++;
                }

                final_counties.get(count).setBurgered(sum);
            }   

            while (final_counties.size() != 0)
            {
                max = -1;

                for (int a = 0; (a <= final_counties.size() - 1); a++)
                {
                    if (final_counties.get(a).getBurgered() > max)
                    {
                        max = final_counties.get(a).getBurgered();
                        maxname = final_counties.get(a).getName();
                        maxpopulation = final_counties.get(a).getPopulation();
                        maxposition = a;
                    }                   
                }
                
                final_counties.remove(maxposition);

                if (max != 0)
                    System.out.println(maxname + ": " + max + ", " + df.format(((double) max / maxpopulation) * 100) + "%");
            }

            final_counties.removeAll(final_counties);

            System.out.println();
            stop = scan.nextLine();
        }
    }
}
