package com.intiformation.siteecommerce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.intiformation.siteecommerce.modele.Categorie;
import com.intiformation.siteecommerce.modele.Produit;
import com.intiformation.siteecommerce.service.BoutiqueServiceImpl;
import com.intiformation.siteecommerce.service.InternauteBoutiqueService;

@Controller
@RequestMapping("/internauteController*")
public class InternauteController {
	
	private InternauteBoutiqueService internauteBoutiqueService;
	
	@Autowired
	public void setInternauteBoutiqueService(InternauteBoutiqueService internauteBoutiqueService) {
		this.internauteBoutiqueService = internauteBoutiqueService;
	}

	/**
	 * permet de Consulter toutes les catégories
	 * @param modeleDonnees
	 * @return
	 */
	@RequestMapping(value="/categories/liste", method= RequestMethod.GET)
	public String toutesCategories(ModelMap modeleDonnees) {
		
		List<Categorie> listeCategories = internauteBoutiqueService.findAllCategories();
		
		modeleDonnees.addAttribute("liste_des_categories", listeCategories);
		
		String categorieJSP = "categories";
		
		return categorieJSP;
	}
	
	/**
	 * permet de Consulter les produits d’une catégorie
	 * @param idCat
	 * @param modeleDonnees
	 * @return
	 */
	@RequestMapping(value="/produits/categories/liste/{categorieID}", method= RequestMethod.GET)
	public String produitsParCategorie(@PathVariable("categorieID") int idCat, ModelMap modeleDonnees) {
		
		List<Produit> listeProduitsParCategorie = internauteBoutiqueService.findProduitsParCategorie(idCat);
		
		modeleDonnees.addAttribute("liste_des_produits_par_categorie", listeProduitsParCategorie);
		
		String produitsParCategorieJSP = "produitsParCategorie";
		
		return produitsParCategorieJSP;
	}
	
	/**
	 * permet de Consulter les produits sélectionnés
	 * @param modeleDonnees
	 * @return
	 */
	@RequestMapping(value="/produits/selectionnes/liste", method= RequestMethod.GET)
	public String produitsSelectionnes(ModelMap modeleDonnees) {
		
		List<Produit> listeProduitsSelectionnes = internauteBoutiqueService.listeProduitsSelectionnes();
		
		modeleDonnees.addAttribute("liste_des_produits_selectionnes", listeProduitsSelectionnes);
		
		String produitsSelectionnesJSP = "produitsSelectionnes";
		
		return produitsSelectionnesJSP;
	}
	
	/**
	 * permet de Chercher des produits par mot clé
	 * @param mc
	 * @param modeleDonnees
	 * @return
	 */
	@RequestMapping(value="/produits/motcle/liste/{designation}", method= RequestMethod.GET)
	public String produitsParMotCle(@PathVariable("designation") String mc, ModelMap modeleDonnees) {
		
		List<Produit> listeProduitsParMotCle = internauteBoutiqueService.findProduitsParMotCle(mc);
		
		modeleDonnees.addAttribute("liste_des_produits_par_motcle", listeProduitsParMotCle);
		
		String produitsParMotCleJSP = "produitsParMotCle";
		
		return produitsParMotCleJSP;
	}

	/**
	 * permet d'afficher un formulaire d'ajout d'un produit
	 * @return
	 */
	@RequestMapping(value= "/addproduitform", method= RequestMethod.GET)
	public ModelAndView setUpFormulaireAjout() {
		
		/*////////////////// données à retourner vers la vues //////////////////*/
		Map<String, Object> data = new HashMap<>();
		
		// 1. déf de l'objet de commande (l'objet à lier au formulaire de la vue)
		Produit produit = new Produit();
		
		// 2. déf du nom de l'objet de commande
		// NB : le nom reste facultatif. nom par défaut est 'command'
		String objetCommandeProduit = "produitCommand";
		
		// 3. association entre l'objet et le nom
		data.put(objetCommandeProduit, produit);
		
		String nomVue = "ajouterProduit";
		
		return new ModelAndView(nomVue, data);
	}
	
	
//	@RequestMapping(value="/produit/add", method=RequestMethod.POST)
//	public String addPrduit(@ModelAttribute("produitCommand") Produit produit, ModelMap donneesVue) {
//		//1. ajout du fonctionnaire dans la bdd via le service
//		internauteBoutiqueService.;
//		
//		//2. recup de la nouvelle liste des fonctionnaire dans la bdd + jout dans le modele
//		
//		donneesVue.addAttribute("liste_fonctionnaires_attribut",fonctionnaireManager.findAllFonctionnaires());
//		
//		//3."redirecttion vers la page fonctionnaires.jsp va l'URL fonctionnaires/liste
//		
//		return "redirect:/fonctionnaires/liste";
//	}
	
	
	
	
	
	
//	Ajouter un produit avec une quantité au panier
	
//	/**
//	 * permet d'afficher le formulaire d'ajout d'un fonctionnaire <br/>
//	 * sera invoquée au click du lien de la page fonctionnaires.jsp <br/>
//	 * sur une requête HTTP en GET <br/>
//	 * URL d'invocation : http://localhost:8080/advencedspringmvc/addfonctionnaireform
//	 * @return
//	 */
//	@RequestMapping(value= "/addfonctionnaireform", method= RequestMethod.GET)
//	public ModelAndView setUpFormulaireAjout() {
//		
//		/*////////////////// données à retourner vers la vues //////////////////*/
//		Map<String, Object> data = new HashMap<>();
//		
//		// 1. déf de l'objet de commande (l'objet à lier au formulaire de la vue)
//		Fonctionnaire fonctionnaire = new Fonctionnaire();
//		
//		// 2. déf du nom de l'objet de commande
//		// NB : le nom reste facultatif. nom par défaut est 'command'
//		String objetCommandeFonctionnaire = "fonctionnaireCommand";
//		
//		// 3. association entre l'objet et le nom
//		data.put(objetCommandeFonctionnaire, fonctionnaire);
//		
//		/*////////////// nom logique de la vue ////////////////// */
//		/**
//		 * résolution de la vue : ajouterFonctionnaire =======> /WEB-INF/views/ajouterFonctionnaire.jsp
//		 */
//		String nomVue = "ajouterFonctionnaire";
//		
//		return new ModelAndView(nomVue, data);
//	}// fin setUpFormulaireAjout
//	
//	
//	
//	/**
//	 * permet d'ajouter un fonctionnaire dans la BDD via le formulaire <br/>
//	 * sera invoquée à la soumission du formulaire (ajoutFonctionnaire.jsp)
//	 * URL d'invocation : http://localhost:8080/advencedspringmvc/fonctionnaire/add (ref : attribut action du formaire)
//	 * @return
//	 */
//	@RequestMapping(value="/fonctionnaire/add", method=RequestMethod.POST)
//	public String addFonctionnaire(@ModelAttribute("fonctionnaireCommand") Fonctionnaire pFonctionnaire, ModelMap donneesVue) {
//		//1. ajout du fonctionnaire dans la bdd via le service
//		fonctionnaireManager.ajouterFonctionnaire(pFonctionnaire);
//		
//		//2. recup de la nouvelle liste des fonctionnaire dans la bdd + jout dans le modele
//		
//		donneesVue.addAttribute("liste_fonctionnaires_attribut",fonctionnaireManager.findAllFonctionnaires());
//		
//		//3."redirecttion vers la page fonctionnaires.jsp va l'URL fonctionnaires/liste
//		
//		return "redirect:/fonctionnaires/liste";
//	}
	
//	Enregistrer le client et la commande des produits de son panier.
	
	
//	Supprimer un produit du panier
	
//	@RequestMapping(value= {"fonctionnaires/delete/{fonctionnaireID}", "fonctionnaires/remove/{fonctionnaireID}"},
//			method= RequestMethod.GET)
//	public String deleteFonctionnaire(@PathVariable("fonctionnaireID") int pIdFonctionnaire, ModelMap donneesVues) {
//		
//		// suppression du fonctionnaire vie la service
//		fonctionnaireManager.supprimerFonctionnaire(pIdFonctionnaire);
//		
//		// recup de la liste des fonctionnaires MAJ dans la BDD
//		List<Fonctionnaire> listeFonctionnaires = fonctionnaireManager.findAllFonctionnaires();
//		
//		// données à retourner vers la vue (fonctionnares.jsp)
//		donneesVues.addAttribute("liste_fonctionnaires_attribut", listeFonctionnaires);
//		
//		// redirection avec le prefix 'redirect' => redirection vers l'URL : /fonctionnaires/liste
//		return "redirect:/fonctionnaires/liste";
//	}// fin deleteFonctionnaire
	
}
