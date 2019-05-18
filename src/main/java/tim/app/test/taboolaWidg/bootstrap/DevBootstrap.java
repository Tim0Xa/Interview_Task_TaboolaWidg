package tim.app.test.taboolaWidg.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import tim.app.test.taboolaWidg.model.PreeSet;
import tim.app.test.taboolaWidg.model.TabooCard;
import tim.app.test.taboolaWidg.repo.PreeSetRepo;
import tim.app.test.taboolaWidg.repo.TabooCardRepo;

import java.util.ArrayList;
import java.util.List;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private TabooCardRepo tRep;
    private PreeSetRepo pRep;
    private List<TabooCard> taboCarr = new ArrayList();

    public DevBootstrap(TabooCardRepo tRep, PreeSetRepo pRep) {
        this.tRep = tRep;
        this.pRep = pRep;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        String originUS = "US";
        String originGB = "Great Britain";
        String originES = "Spain";

        String[] compName ={
                "Bose",
                "Chase",
                "Pfizer",
                "Blue Apron",
                "BMW",
                "Fitbit",
                "Stanford",
                "Macy's",
                "Dasani",
                "eSalon",
                "Secret Escapes",
                "Secret Escapes",
                "Intel",
                "ASOS",
                "Cornerstone",
                "FourFourTwo",
                "Stuff",
                "Fashion Insider",
                "Bloomberg",
                "LifeCell",
                "Life Cell",
                "Aventura Vacations",
                "Aventura Vacations",
                "Axe",
                "Axe",
                "Colgate",
                "Colgate",
                "JetCost",
                "Secret Escapes",
                "OxFam",
                "Travelzoo",
                "Idealista"
        };

        String[] slogan ={
                "Bose’s Latest Bluetooth Headphones Don’t Disappoint",
                "Cash in Travel Rewards for Your Dream Trip",
                "Facts About Pneumonia",
                "My Husband and I Tried Blue Apron, Here’s What Happened",
                "Watch Katie Couric and the Internet 21 Years Later",
                "Fitbit Just Announced The Gadget Of Your Dreams",
                "When Not Taking Too Much Advice Is Good For Business",
                "4 Plus Size Outfit Styles That Every Woman Needs",
                "A Sparkling Summer Mocktail Without the Extra Calories",
                "If You Struggle with Coloring Grays, Try This…",
                "Luxury Travel Secrets – How To Get The Best Rates",
                "Luxury Travel For Dummies",
                "How technology has taken Thunderbirds to new heights",
                "Learn to do more",
                "Change The Way You Shave With Cornerstone",
                "Video: 6 Lessons In Leadership From Vincent Kompany",
                "11 Things You Didn't Know About WhatsApp",
                "How To Dress Well Without Trying [Quiz]",
                "Patek Philippe Becomes Most Expensive Wristwatch Ever Sold at Geneva Charity Auction",
                "El mejor tratamiento para piel flácida y arrugada",
                "La ciencia revela crema antiedad mejor que cirugía",
                "Regálale a Mamá el viaje que soñó",
                "Las Mejores Playas para Conocer",
                "¿Cuál es tu mood de hoy?",
                "Entonces ¿qué vamos a hacer hoy?",
                "¿Cuántos tipos de caries existen?",
                "Picar entre horas puede afectar a la salud bucodental",
                "Vuelos Baratos desde 9€",
                "Tus vacaciones de ensueño por la mitad de precio",
                "Firma y acaba con los paraísos fiscales",
                "499€ -- Circuito de 5 días por Sicilia en 2016 hasta -40%",
                "15 pisos en venta con vistas monumentales"
        };

        String[] imgUrl ={
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/a674612c9534c92e82c477a04b1ff864.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/63bee2719968b8371ffa64aac41710e2.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/f54def667a58dbec69cb7b19e69c6635.png",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/a7e19c31eb993ed8a7c46ede48c75fb9.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/cec05b0be9938a5e93843fe2f6c72050.png",
                "http://media4.popsugar-assets.com/files/2016/01/05/823/n/1922398/2b4a2d5e_edit_img_facebook_post_image_file_39666132_1452019170Pv49fC.fbshare.jpg",
                "http://www.gsb.stanford.edu/sites/gsb/files/khaled-0515.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/11d030900379847502e56bc266f6fd8f.png",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/0ce763ba0b69fc5237ba6ce8638cf44b.jpg",
                "http://cdn.taboola.com/libtrc/static/thumbnails/ef5dbc37dd211b230acb719421eeba2d.jpg",
                "http://nativeads365.com/sites/master.n365.server.udev.se/files/styles/col_1/public/img/article/430x287infinity-pool.jpg?itok=xZ0qeQ9Z",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/83f2750389cf5ee27c9f2e58e44a75af.jpg",
                "http://www.intel.com/etc/designs/intel/us/en/images/printlogo.png",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/cb080dbb70c395fd53a4566f5a1aadef.jpg",
                "https://e42bcdc5abef6d913b6b-7d1ad931b66854ad34cb9bd867442c3a.ssl.cf3.rackcdn.com/uploads/previewimage3.jpg",
                "http://images.cdn.fourfourtwo.com/sites/fourfourtwo.com/files/performance/vincent-kompany-lead-your-team.jpg",
                "https://images.cdn.stuff.tv/sites/stuff.tv/files/brands/WhatsApp/2017_update/00-whatsapp-tips-lead_stuff.png",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/963db1e019449d611c452df5289abd66.jpg",
                "http://assets.bwbx.io/images/ikXR7du9vBzc/v1/-1x-1.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/f3c9e471a73c6a946062b41e5b33a0bd.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/eb9d2775411ec9873f04027af476c71e.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/03b97d141e8256674b7c68fa42f690e4.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/a7556987b0060fd4dec2962bc7c163a5.jpg",
                "http://cdn.taboola.com/libtrc/static/thumbnails/a713788133bbde9a73ccabc4b9422c74.jpg",
                "http://cdn.taboola.com/libtrc/static/thumbnails/1804877743a778ab99afcc85c22f07ca.jpg",
                "http://cdn.taboola.com/libtrc/static/thumbnails/32476f44cb34e4f30f9a506bc28adb37.jpg",
                "http://p2.trrsf.com/image/fget/cf/600/600/images.terra.com/2017/09/18/alimentosthinkstock6.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/07451f906f5d8beb23ddd0929070e525.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/05fea125bad033662fc1c3cbf0b18998.jpg",
                "http://cdn.taboolasyndication.com/libtrc/static/thumbnails/d23025484434f4ee1a23fd017d4b47f5.jpg",
                "http://www.tzoo-img.com/images/tzoo.dp.media.31471.376309.Etna-Toarmina.jpg?v=ae60",
                "http://cdn.taboola.com/libtrc/static/thumbnails/864bf4f143c95e8acb8cc8e666dc2751.jpg"
        };

        for (int i=0; i < compName.length; i++){
            if( i < 10 ){taboCarr.add(new TabooCard(imgUrl[i],slogan[i],compName[i],originUS));}
            if(i >= 10 && i < 19 ){taboCarr.add(new TabooCard(imgUrl[i],slogan[i],compName[i],originGB));}
            if(i >= 19 && i < 32 ){taboCarr.add(new TabooCard(imgUrl[i],slogan[i],compName[i],originES));}
        }
        tRep.saveAll(taboCarr);
        pRep.save(new PreeSet(taboCarr.get(1),taboCarr.get(2),taboCarr.get(4),taboCarr.get(5),taboCarr.get(6),taboCarr.get(7)));
        pRep.save(new PreeSet(taboCarr.get(9),taboCarr.get(7),taboCarr.get(5),taboCarr.get(8),taboCarr.get(6),taboCarr.get(2)));
        pRep.save(new PreeSet(taboCarr.get(5),taboCarr.get(6),taboCarr.get(7),taboCarr.get(8),taboCarr.get(9),taboCarr.get(1)));
        pRep.save(new PreeSet(taboCarr.get(11),taboCarr.get(12),taboCarr.get(14),taboCarr.get(15),taboCarr.get(16),taboCarr.get(17)));
        pRep.save(new PreeSet(taboCarr.get(29),taboCarr.get(27),taboCarr.get(25),taboCarr.get(28),taboCarr.get(26),taboCarr.get(22)));
        pRep.save(new PreeSet(taboCarr.get(29),taboCarr.get(13),taboCarr.get(18),taboCarr.get(25),taboCarr.get(30),taboCarr.get(15)));
    }
}
